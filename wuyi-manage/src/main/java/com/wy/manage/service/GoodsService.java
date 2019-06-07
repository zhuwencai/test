package com.wy.manage.service;

import com.wy.manage.pojo.Goods;
import com.wy.manage.vo.PageObject;

public interface GoodsService {
	PageObject<Goods> findGoods(Integer pageCurrent);

	void insertGoods(Goods goods);

	void updateGoods(Goods goods);

	void deleteGoodsById(Integer... Ids); 
	
}
