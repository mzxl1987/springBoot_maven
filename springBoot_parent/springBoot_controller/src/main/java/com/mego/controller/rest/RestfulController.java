package com.mego.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mego.entity.MyException;

@RestController
@RequestMapping(value="/rest")
public class RestfulController {


	@RequestMapping(value="/exception", method = RequestMethod.GET, produces="application/json")
	public int exception() throws Exception{
		throw new MyException("303", "异常");
	}	
}
