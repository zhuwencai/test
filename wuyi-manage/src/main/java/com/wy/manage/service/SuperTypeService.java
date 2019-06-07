package com.wy.manage.service;

import com.wy.manage.pojo.SupperType;
import com.wy.manage.vo.PageObject;

public interface SuperTypeService {

	PageObject<SupperType> findSuperType();

	void saveSuperType(String typeName);

	void delSuperTypeById(Integer... ids);

}
