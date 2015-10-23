package org.camel.jetty.gateway;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.http.HttpMethods;

public class PaymentProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// Grab the booked header value
//        String bookId = (String) exchange.getIn().getHeader("bookid");
        // send a html response
//        exchange.getOut().setBody("<html><body>Book " + bookId + " is Camel in Action.</body></html>");
        exchange.getOut().setHeader(Exchange.HTTP_RESPONSE_CODE, 301);
        exchange.getOut().setHeader(Exchange.HTTP_METHOD, "POST");
        exchange.getOut().setHeader("location", "http://localhost:8080/simple-spring-webmvc"); 
	}

}
