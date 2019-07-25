package com.mego.thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleThread implements Runnable {
	
	private int index;
	
	public void setIndex(int index){
		this.index = index;
	}
	
	public void run() {
		
		log.info(" thread index = {} ",index);

	}

}
