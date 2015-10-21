package org.camel.transformation.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A bean which we use in the route
 */
public class HelloBean {

    public static String hello(String data) {
        return data;
    }
}
