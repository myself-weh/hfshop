package com.weh.hfshop.entity;

import java.math.BigDecimal;

public class SkuVo extends Sku{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1958211843847715507L;
	int pageNum=1;
	int pageSize=5;
	
	//查询的关键字 只要name 或者 caption 当中有一个字段匹配即可
	String key;
	
	//价格区间
	BigDecimal minPrice;
	
	BigDecimal maxPrice;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public BigDecimal getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}

	public BigDecimal getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}

	@Override
	public String toString() {
		return "SkuVo [pageNum=" + pageNum + ", pageSize=" + pageSize + ", key=" + key + ", minPrice=" + minPrice
				+ ", maxPrice=" + maxPrice + "]";
	}
	
	
}
