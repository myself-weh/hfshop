package com.weh.hfshop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weh.hfshop.entity.Category;
import com.weh.hfshop.service.CategoryService;

@Controller
@RequestMapping("cat")
public class CatController {

	@Reference
	CategoryService catService;
	
	/**
	 * 跳转到jsp 页面进行渲染
	 * @return
	 */
	@RequestMapping("index")
	public String index() {
		return "cat/index";
	}
	
	
	@RequestMapping("data")
	@ResponseBody
	public List<Category> getData(){
		// 获取到所有分类的数据
		 List<Category> categories = catService.list(0);
		 return categories;
		
	}
	
	@RequestMapping("add")
	@ResponseBody
	public String add(HttpServletRequest requrt,Category cat) {
		return catService.add(cat)>0?"ok":"failed";
	}
	
	
	@RequestMapping("delete")
	@ResponseBody
	public String delete(HttpServletRequest requrt,int id) {
		return catService.del(id)>0?"ok":"failed";
	}
	
	
	@RequestMapping("update")
	@ResponseBody
	public String update(HttpServletRequest requrt,Category cat) {
		return catService.udpate(cat)>0?"ok":"failed";
	}
}
