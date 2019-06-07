package com.wy.manage.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
@Data
public class PageObject<T> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5481127377614561625L;
	private List<T> records;//查询到的记录数
	private Integer pageCurrent;//当前页码值
	private Integer pageCount;//总页数
	private Integer rowCount;//总记录数
	private Integer pageSize;//页面大小
}
