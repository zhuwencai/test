package com.wy.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wy.manage.mapper.GoodsMapper;
import com.wy.manage.pojo.Goods;
import com.wy.manage.vo.PageObject;

@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Override
	public PageObject<Goods> findGoods(Integer pageCurrent) {
		
		int rowCount = goodsMapper.selectCount(null);
		int pageSize = 5;
		int startIndex = (pageCurrent-1)*pageSize;
		List<Goods> records = goodsMapper.findGoods(startIndex, pageSize);
		
		PageObject<Goods> po = new PageObject<>();
		int pageCount = ((rowCount-1)/pageSize+1);
		po.setPageCount(pageCount);
		po.setPageCurrent(pageCurrent);
		po.setPageSize(pageSize);
		po.setRecords(records);
		po.setRowCount(rowCount);
		return po;
	}

	@Override
	public void insertGoods(Goods goods) {
		goodsMapper.insertGoods(goods);
		
	}

	@Override
	public void updateGoods(Goods goods) {
		goodsMapper.updateGoods(goods);
		
	}

	@Override
	public void deleteGoodsById(Integer... Ids) {
		
		goodsMapper.deleteGoodsById(Ids);
	}
	
}
