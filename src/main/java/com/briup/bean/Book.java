package com.briup.bean;
/**
 * 书籍类，其中每一本书都对应一个分类
 * @author admin
 *
 */
public class Book {
	private Integer id;
	private String name;
	private Double price;
	
	private Category category;
	private String image;
	
	public Book() {
//		System.out.println("Book() ...");
	}
	public Book(Integer id) {
		super();
		this.id = id;
	}

	public Book(String name, double price) {
//		System.out.println("Book(name,price) ...");
		this.name = name;
		this.price = price;
	}
	public Book(Integer id, String name, double price) {
//		System.out.println("Book(id,name,price) ...");
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Book(String name, double price, Category category) {
//		System.out.println("Book(name,price,category)...");
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public Book(Integer id, String name, double price, Category category) {
//		System.out.println("Book(name,price,category,category)...");
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public Book(Integer id, String name, Double price, Category category, String image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.image = image;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
//		System.out.println("setId...");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
//		System.out.println("setName...");
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
//		System.out.println("setPrice...");
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
//		System.out.println("setCategory...");
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", image=" + image
				+ "]";
	}
	
}
