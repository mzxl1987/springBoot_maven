package com.mego.schedule;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Component
@EnableScheduling
@Slf4j
public class SimpleSchedule {

	public static final AtomicInteger i = new AtomicInteger(0);
	
	/**
	 * 定时任务
	 */
	@Scheduled(cron="0/10 * * * * ?")
	public void scheduleOne(){
		
		log.info("schedule 1, 运行次数: {} ",i.incrementAndGet());
		
	}
	
}
