package com.briup.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 分类类
 * @author admin
 *
 */
public class Category {
	private Integer id;
	private String name;
	
	// 一级分类中有多个二级分类
	private List<Category> cates = new ArrayList<Category>();
	
	public Category() {
//		System.out.println("Category()...");
	}
	public Category(String name) {
		this.name = name;
	}
	public Category(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
//		System.out.println("setId()...");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
//		System.out.println("setName()...");
		this.name = name;
	}
	public List<Category> getCates() {
		return cates;
	}
	public void setCates(List<Category> cates) {
		this.cates = cates;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", cates=" + cates + "]";
	}
	
	
}
