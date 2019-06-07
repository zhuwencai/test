package com.wy.manage.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
@Data
@TableName("tb_goods")
public class Goods implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7696448066195476149L;
	@TableId(type=IdType.AUTO)
	private Integer ID;
	private Integer typeID;
	private String goodsName;
	private String introduce;
	private Double price;
	private Double nowPrice;
	private String picture;
	private Date INTime;
	private Integer newGoods;
	private Integer sale;
	private Integer hit;
	private Integer stock;
	
}



