package com.wy.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wy.manage.pojo.SupperType;
import com.wy.manage.service.SuperTypeService;
import com.wy.manage.vo.JsonResult;
import com.wy.manage.vo.PageObject;

@RestController
public class SuperTypeController {
	
	@Autowired
	private SuperTypeService superTypeService;
	
	@RequestMapping("/good/doFindSuperTypes.do")
	public JsonResult findSuperType() {
		PageObject<SupperType> superType = superTypeService.findSuperType();
		return new JsonResult(superType);
	}
	
	@RequestMapping("/good/doAddSuperType.do")
	public JsonResult saveSuperType(String typeName) {
		superTypeService.saveSuperType(typeName);
		return new JsonResult("save ok");
	}
	
	@RequestMapping("/good/doDelSuperType.do")
	public JsonResult doDelSuperType(Integer... ids) {
		superTypeService.delSuperTypeById(ids);
		return new JsonResult("delete ok");
	}
}







