package org.simple.spring.webmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    private static Log log = LogFactory.getLog(IndexController.class);
    
    @RequestMapping(value = "/")
    public String show(Model model) {
    	log.info("get going index()");
    	String message = "Hello World !";
    	model.addAttribute("helloMessage", message);
    	return "index";
    }
    
    @RequestMapping(value = "/", method = {RequestMethod.POST})
    public String index(Model model, HttpServletRequest request) {
    	String username= request.getParameter("username");
        log.info("post going index()");
        model.addAttribute("helloMessage", username);
        return "index";
    }

}
