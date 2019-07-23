package com.mego.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class MyException extends RuntimeException {

	private String code;
    private String msg;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
	
	public String getMessage() {
		return "" + code + " : " + msg;
	}
	
	public static MyException getInstance(String code, String msg) {
		return new MyException(code, msg);
	}
    
}
