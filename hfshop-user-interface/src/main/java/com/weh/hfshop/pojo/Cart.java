package com.weh.hfshop.pojo;

import java.io.Serializable;
import java.util.Date;

import com.weh.hfshop.entity.Sku;

public class Cart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private int uid;//用户id
	private int skuid;//sku 的id
	private int pnum; // 购买数量
	private Date createtime;//添加的时间
	private Date updatetime;//最后的修改时间
	
	private Sku sku;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sku getSku() {
		return sku;
	}

	public void setSku(Sku sku) {
		this.sku = sku;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getSkuid() {
		return skuid;
	}
	public void setSkuid(int skuid) {
		this.skuid = skuid;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", uid=" + uid + ", skuid=" + skuid + ", pnum=" + pnum + ", createtime=" + createtime
				+ ", updatetime=" + updatetime + "]";
	}
	
	
	
}
