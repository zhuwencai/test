package com.wy.manage.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class JsonResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6761614996466898200L;
	private Integer state=1;
	private String message="ok";
	private Object data;
	public JsonResult() {
		super();
	}
	public JsonResult(String message) {
		super();
		this.message = message;
	}
	public JsonResult(Object data) {
		super();
		this.data = data;
	}
	
	public JsonResult(Throwable e) {
		this.state=0;
		this.message=e.getMessage();
	}
}
