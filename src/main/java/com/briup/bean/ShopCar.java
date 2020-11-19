package com.briup.bean;
/**
 *购物车类，包含顾客书籍和数量 
 * @author admin
 *
 */
public class ShopCar {
	private Customer customer;
	private Book book;
	private Integer num;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public ShopCar() {
	}
	public ShopCar(Customer customer, Book book, Integer num) {
		this.customer = customer;
		this.book = book;
		this.num = num;
	}
	@Override
	public String toString() {
		return "ShopCar [customer=" + customer + ", book=" + book + ", num=" + num + "]";
	}
	
	
	
}
