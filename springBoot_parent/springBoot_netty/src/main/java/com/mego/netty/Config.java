package com.mego.netty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mego.netty.server.EchoServer;

@Configuration
public class Config {

	@Bean
	public EchoServer echoServer(){
		
		com.mego.netty.server.Configuration configuration = com.mego.netty.server.Configuration.createInstance();
    	configuration.setHost("127.0.0.1");
    	configuration.setPort(7005);
		
		return new EchoServer(configuration);
	}
	
}
