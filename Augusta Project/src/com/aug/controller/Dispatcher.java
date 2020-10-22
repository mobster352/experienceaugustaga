package com.aug.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

@Controller
public class Dispatcher {
	
	@RequestMapping(value={"/index"})
    public String redirectIndex(Model model, HttpServletRequest request) {    	
        return "index";
    }
	
	@RequestMapping(method={RequestMethod.POST}, value={"/api"})
    public void callAPI(Model model, HttpServletRequest request) { 
		String eventData = request.getParameter("text");
		System.out.println(eventData);
    }
}
