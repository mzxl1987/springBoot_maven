package com.mego.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller	
public class ErrorController {

	@RequestMapping(path={"/error"}, method=RequestMethod.GET)
	public Object error(Model mod, HttpServletRequest request) throws Exception{
		
		mod.addAttribute("url", request.getRequestURL());
		
		return "error";
	}
	
}
