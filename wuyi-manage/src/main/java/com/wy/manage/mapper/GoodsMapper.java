package com.wy.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wy.manage.pojo.Goods;

public interface GoodsMapper extends BaseMapper<Goods>{
	List<Goods> findGoods(@Param("startIndex")Integer startIndex,
			              @Param("pageSize")Integer pageSize);

	void insertGoods(Goods goods);

	void updateGoods(Goods goods);

	void deleteGoodsById(@Param("Ids")Integer... Ids);
	
	
}
