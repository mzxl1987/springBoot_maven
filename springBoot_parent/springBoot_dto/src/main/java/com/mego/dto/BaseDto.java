package com.mego.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	@JsonIgnore
	private Date createDate;
	
	@JsonIgnore
	private Date updateDate;
	
	private String createBy;
	
	private String updateBy;
	

	public boolean isEmptyOrNull(Object obj){
		return null == obj || obj == null || "".equals(obj);
	}
	
	
}
