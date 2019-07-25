package com.mego.netty.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mego.netty.protocol.ProtocolDecoder;
import com.mego.netty.protocol.ProtocolEncoder;
import com.mego.netty.scheduler.CancelableScheduler;
import com.mego.netty.scheduler.HashedWheelTimeoutScheduler;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

public class ServerInitializer extends ChannelInitializer<Channel> {
	
	@Autowired
	private EchoServerHandler echoServerHandler;
	
	public void start(){
		echoServerHandler = new EchoServerHandler();
	}
	
	@Override
	protected void initChannel(Channel ch) throws Exception {
		
		ch.pipeline()
		.addLast(new ProtocolDecoder())
		.addLast(new ProtocolEncoder())
		.addLast(echoServerHandler);

	}

}
