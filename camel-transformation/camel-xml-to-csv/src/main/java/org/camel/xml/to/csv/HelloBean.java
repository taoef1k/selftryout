package org.camel.xml.to.csv;

import java.text.SimpleDateFormat;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * A bean which we use in the route.
 */
public class HelloBean implements Hello {

    /** The say. */
    private String say = "Hello World";

    /* (non-Javadoc)
     * @see org.camel.xml.to.csv.Hello#hello()
     */
    public String hello() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return say + " at " + sdf.format(new Date());
    }

    /**
     * Gets the say.
     *
     * @return the say
     */
    public String getSay() {
        return say;
    }

    /**
     * Sets the say.
     *
     * @param say the new say
     */
    public void setSay(String say) {
        this.say = say;
    }
}
