package com.wy.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wy.manage.mapper.SupperTypeMapper;
import com.wy.manage.pojo.SupperType;
import com.wy.manage.vo.PageObject;

@Service
public class SuperTypeServiceImpl implements SuperTypeService {
	
	@Autowired
	private SupperTypeMapper superTypeMapper;

	@Override
	public PageObject<SupperType> findSuperType() {
		List<SupperType> records = superTypeMapper.findSupperType();
		PageObject<SupperType> po = new PageObject<>();
		po.setRecords(records);
		
		return po;
	}

	@Override
	public void saveSuperType(String typeName) {
		superTypeMapper.insertSuperType(typeName);
		
	}

	@Override
	public void delSuperTypeById(Integer... ids) {
		superTypeMapper.delSuperTypeById(ids);
		
	}
	
}
