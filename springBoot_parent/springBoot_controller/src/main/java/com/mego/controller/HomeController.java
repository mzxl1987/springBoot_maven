package com.mego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	
public class HomeController {

	@RequestMapping(path={"/","/dashboard"}, method=RequestMethod.GET)
	public Object home() throws Exception{
		throw new Exception("view Exception");
//		return "index";
	}
	
	@RequestMapping(path="/exception/{name}", method = RequestMethod.POST)
	@ResponseBody
	public Object exception(@PathVariable(value="name") String name) throws Exception{
		throw new Exception("Hello EXCEPTION");
	}
	
	@RequestMapping(path="/myexception/{name}", method = RequestMethod.POST)
	@ResponseBody
	public Object myexception(@PathVariable(value="name") String name) throws Exception{
		throw new Exception("Hello MYEXCEPTION");
	}
	
}
