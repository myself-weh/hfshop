package com.weh.hfshop.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private int skuid;
	private BigDecimal total;
	private int oid;
	private int pnum;
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getSkuid() {
		return skuid;
	}
	public void setSkuid(int skuid) {
		this.skuid = skuid;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", skuid=" + skuid + ", total=" + total + ", oid=" + oid + ", pnum=" + pnum
				+ "]";
	}
	
	
}
