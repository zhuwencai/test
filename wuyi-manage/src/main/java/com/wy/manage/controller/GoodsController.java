package com.wy.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wy.manage.pojo.Goods;
import com.wy.manage.service.GoodsService;
import com.wy.manage.vo.JsonResult;
import com.wy.manage.vo.PageObject;

@RestController
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/goods/doFindPageObjects.do")
	public JsonResult findGoods(Integer pageCurrent) {
		PageObject<Goods> goods = goodsService.findGoods(pageCurrent);
		return new JsonResult(goods);
	}
	
	@RequestMapping("/goods/doSaveObject.do")
	public JsonResult insertGoods(Goods goods) {
		goodsService.insertGoods(goods);
		return new JsonResult("添加成功");
	}
	
	@RequestMapping("/goods/doUpdateObject.do")
	public JsonResult updateGoods(Goods goods) {
		goodsService.updateGoods(goods);
		return new JsonResult("修改成功");
	}
	
	@RequestMapping("/goods/doDeleteObjects.do")
	public JsonResult deleteGoods(@RequestParam("ID")Integer... Ids) {
		goodsService.deleteGoodsById(Ids);
		return new JsonResult("删除成功");
	}
	
	
}






