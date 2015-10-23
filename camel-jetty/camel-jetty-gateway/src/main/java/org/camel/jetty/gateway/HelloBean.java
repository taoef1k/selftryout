package org.camel.jetty.gateway;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Header;
import org.camel.jetty.gateway.model.Person;

/**
 * A bean which we use in the route
 */
public class HelloBean {

    public Person hello(@Header("username") String username,
    		@Header("password") String password) {
        
    	Person p= new Person();
    	p.setId(1);
    	p.setName(username);
    	p.setAge(20);
    	
        return p;
    }
    
    public String answer(@Header("username") String username,
    		@Header("password") String password) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("ansewer username = " + username + " - password = " + password);
        return sdf.format(new Date()) + " - username = " + username + " - password = " + password;
    }
}
