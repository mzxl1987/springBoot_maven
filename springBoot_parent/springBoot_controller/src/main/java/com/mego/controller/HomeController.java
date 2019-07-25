package com.mego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mego.entity.ViewException;


@Controller	
public class HomeController {

	@RequestMapping(path={"/","/dashboard"})
	public Object home() throws Exception{
		throw new ViewException("701","view Exception");
//		return "index";
	}
	
	@RequestMapping(path="/exception/{name}", method = RequestMethod.GET)
	@ResponseBody
	public Object exception(@PathVariable(value="name") String name) throws Exception{
		throw new Exception("Hello EXCEPTION");
	}
	
	@RequestMapping(path="/myexception/{name}", method = RequestMethod.GET)
	@ResponseBody
	public Object myexception(@PathVariable(value="name") String name) throws Exception{
		throw new Exception("Hello MYEXCEPTION");
	}
	
}
