package com.attunedlabs.eventframework.camel.eventbuilder;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.attunedlabs.eventframework.camel.eventproducer.AbstractCamelEventBuilder;
import com.attunedlabs.eventframework.event.LeapEvent;
import com.attunedlabs.eventframework.jaxb.Event;
import com.attunedlabs.eventframework.jaxb.EventMapping;
import com.attunedlabs.eventframework.jaxb.Source;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
/**
 * This class is OGNL EventBuilder. Based on the OGNL Mapping defined in the eventing.xml it builds the 
 * Event.
 * @author bizruntime
 *
 */
public class OgnlEventBuilder extends AbstractCamelEventBuilder{

	protected static final Logger logger = LoggerFactory.getLogger(OgnlEventBuilder.class);

	@Override
	public LeapEvent buildEvent(Exchange camelExchange,Event event) {
		logger.debug("inside buildEvent() of OgnlEventBuilder"+camelExchange.getIn().getHeaders());
		String eventname=event.getId();
		logger.debug("event name : "+eventname);
		
		LeapEvent leapevent=super.updateStandardCamelHeader(eventname,camelExchange);
		List<Source> sourceList=new ArrayList();
		sourceList.addAll(event.getCamelEventProducer().getCamelEventBuilder().getOGNLMapping().getSource());
				
		if(sourceList!=null){
			for(Source source:sourceList){
				String sourceFrom=source.getFrom();
				switch(sourceFrom){
						case "CamelExchange" : 
														List<EventMapping> eventMappingList=source.getEventMapping();
														constructEventDataFromExchange(camelExchange,leapevent,eventMappingList);
														break;
						
						case "DataGrid" :
														constructEventDataFromDataGrid();
														break;
						
						default : 
														logger.debug("Type is not supported");
														break;
					
				}//end of switch
				
			}//end of for(Source source:sourceList)
			
		}//end of if(source!=null)
		
	return leapevent;
	}

	private void constructEventDataFromDataGrid() {
		//TODO we will provide Implementation logic to construct event using datagrid
	}


	private void constructEventDataFromExchange(Exchange exchange,LeapEvent leapevent,List<EventMapping> evtMappingList){
		logger.debug("inside constructEventDataFromExchange() from  OgnlEventBuilder ");
		logger.debug("inside constructEventDataFromExchange in ognl event mapping list : "+evtMappingList);
		 for(EventMapping evtMapping : evtMappingList){
				try {
					//Source Mapping
					Object srcExpression = Ognl.parseExpression( evtMapping.getSource() );
					logger.debug("source : "+srcExpression);
					OgnlContext ctx = new OgnlContext();
				    Object value = Ognl.getValue(srcExpression, ctx,exchange);
				    logger.debug("ctx : "+ctx.getCurrentObject());
				    logger.debug("------------->OGNL Returned Value="+value);
				    //Destination Mapping
				    Object destExpression = Ognl.parseExpression( evtMapping.getDestination() );
				    logger.debug("destination : "+destExpression);
					Ognl.setValue(destExpression, leapevent,value);
							
				} catch (OgnlException e) {
					logger.error("exception in constructEventDataFromExchange method OGNLEventBuilder object and cause is : "+e.getCause());
				}
		}
		 logger.debug("Event Object Is---->"+leapevent.toString()); 
		
	}//end of constructEventDataFromExchange
	
	
}
