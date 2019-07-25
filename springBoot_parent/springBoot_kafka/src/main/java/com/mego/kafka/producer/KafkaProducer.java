package com.mego.kafka.producer;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import lombok.extern.slf4j.Slf4j;

@Component
//@EnableScheduling
//@EnableKafka
@Slf4j
public class KafkaProducer {

//	private Logger log = LoggerFactory.getLogger(KafkaProducer.class);
	
	@SuppressWarnings("rawtypes")
	@Autowired
	private KafkaTemplate kafkaTemplate;
	
//	@Scheduled(cron=" 00/1 * * * * ?")
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void sendTestMsg(){
		
		String message = UUID.randomUUID().toString();
		ListenableFuture future = kafkaTemplate.send("test", message);
		
		future.addCallback(succ -> {
			log.info("Test消息发送成功");
		}, fail -> {
			log.error("消息发送失败");
		});
		
	}
	
//	@Scheduled(cron=" 00/5 * * * * ?")
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void sendChatMsg(){
		
		String message = UUID.randomUUID().toString();
		ListenableFuture future = kafkaTemplate.send("chat", message);
		
		future.addCallback(succ -> {
			log.info("Chat消息发送成功");
		}, fail -> {
			log.error("消息发送失败");
		});
		
	}
	
}
