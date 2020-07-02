package com.weh.hfshop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.weh.hfshop.entity.Category;
import com.weh.hfshop.entity.Sku;
import com.weh.hfshop.entity.Spu;
import com.weh.hfshop.entity.SpuVo;
import com.weh.hfshop.service.CategoryService;
import com.weh.hfshop.service.SkuService;
import com.weh.hfshop.service.SpuService;

@Controller
public class IndexController {

	@Reference
	SpuService spuService;
	
	@Reference
	SkuService skuService;
	
	@Reference
	CategoryService catService;
	
	
	@RequestMapping({"/","index"})
	public String index(HttpServletRequest request,SpuVo spuVo) {
		spuVo.setPageSize(3);
		PageInfo<Spu> pageInfo = spuService.list(spuVo);
		//pageInfo.getPageNum()
		//pageInfo.getPages()
		request.setAttribute("pageInfo", pageInfo);
		request.setAttribute("spuVo", spuVo);
		return "index";
	}
	
	@RequestMapping("spu")
	public String spuDetail(HttpServletRequest request,int spuId) {
		
		// 获取spu 的信息
		Spu spu = spuService.getById(spuId);
		// 获取sku的列表
		List<Sku> skuList = skuService.listDetailBySpu(spuId);
		System.out.println("spu is " + spu);
		System.out.println("sku is " + skuList);
		request.setAttribute("spu", spu);
		request.setAttribute("skuList", skuList);
		return "spudetail";
	}
	
	@RequestMapping("catData")
	@ResponseBody
	public List<Category> getData(){
		// 获取到所有分类的数据
		 List<Category> categories = catService.list(0);
		 return categories;
		
	}
}
