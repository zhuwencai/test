package com.wy.manage.pojo;

import java.io.Serializable;

public class SupperType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6263726779024859177L;
	private Integer id;
	private String typeName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
}
