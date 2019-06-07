package com.wy.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/index")
	public String index() {
		return "manage/index";
	}
	
	@RequestMapping("/doGoodsManage.do")
	public String doGoodsManage() {
		return "manage/goods_manager";
	}
	
	@RequestMapping("/doTopGoods.do")
	public String doTopGoods() {
		return "manage/topmanage";
	}
	
	@RequestMapping("/doMemManage.do")
	public String doMemManage() {
		return "manage/membermanage";
	}
	
	@RequestMapping("/doOrderManage.do")
	public String doOrderManage() {
		return "manage/ordermanage";
	}
	
	@RequestMapping("/doPageUI.do")
	public String doPageUI() {
		return "common/page";
	}
	
	@RequestMapping("/goodsma/doGoodsAdd.do")
	public String doGoodsAdd() {
		return "manage/goods_add";
	}
	
	@RequestMapping("/goodsma/doGoodsModify.do")
	public String doGoodsModify() {
		return "manage/goods_modify";
	}
	
	@RequestMapping("/goodsma/doSuperType.do")
	public String doSuperType() {
		return "manage/superType";
	}
	
	@RequestMapping("/goodsma/doAddSuperType.do")
	public String doAddSuperType() {
		return "manage/super_add";
	}
	
	@RequestMapping("/doLogin.do")
	public String doLogin() {
		return "manage/Login_M";
	}
}












