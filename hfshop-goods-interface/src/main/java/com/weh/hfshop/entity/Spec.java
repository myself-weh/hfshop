package com.weh.hfshop.entity;

import java.io.Serializable;
import java.util.List;

public class Spec implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Integer id;
	String specName;
	
	List<SpecOption> options;

	public Spec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Spec(String name) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public List<SpecOption> getOptions() {
		return options;
	}

	public void setOptions(List<SpecOption> options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "Spec [id=" + id + ", specName=" + specName + "]";
	}
	
	

}
