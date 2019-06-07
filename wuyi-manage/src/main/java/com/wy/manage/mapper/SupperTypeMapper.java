package com.wy.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wy.manage.pojo.SupperType;

public interface SupperTypeMapper {
	List<SupperType> findSupperType();

	void insertSuperType(String typeName);

	void delSuperTypeById(@Param("ids")Integer... ids);
}
