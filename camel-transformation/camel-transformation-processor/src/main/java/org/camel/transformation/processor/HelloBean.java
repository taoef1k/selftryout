package org.camel.transformation.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;


/**
 * A bean which we use in the route
 */
public class HelloBean implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String custom = exchange.getIn().getBody(String.class);
		exchange.getIn().setBody(custom);
	}
}
