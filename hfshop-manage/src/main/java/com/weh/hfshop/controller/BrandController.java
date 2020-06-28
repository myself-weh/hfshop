package com.weh.hfshop.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weh.hfshop.entity.Brand;
import com.weh.hfshop.service.BrandService;

@Controller
@RequestMapping("brand")
public class BrandController {

	@Reference
	private BrandService brandService;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Brand> list = brandService.list();
		list.forEach(x->{System.out.println("brand列表 ： " + x);});
		model.addAttribute("list", list);
		return "brand/list";
		
	}
}
