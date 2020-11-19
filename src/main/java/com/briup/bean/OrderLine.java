package com.briup.bean;
/**
 * 订单项，每个订单项对应一个订单，订单项里面包含书籍信息和数量信息。
 * @author admin
 *
 */
public class OrderLine {
	private Integer id;
	private Integer num;	
	
	private Book book;
	
	private Order order;
	
	
	public OrderLine() {}
	public OrderLine(Integer num) {
		this.num = num;
	}
	public OrderLine(Integer id, Integer num) {
		this.id = id;
		this.num = num;
	}
	
	public OrderLine(Integer num, Book book, Order order) {
		super();
		this.num = num;
		this.book = book;
		this.order = order;
	}
	public OrderLine(Integer id, Integer num, Book book) {
		this.id = id;
		this.num = num;
		this.book = book;
	}
	
	public OrderLine(Integer id, Integer num, Book book, Order order) {
		super();
		this.id = id;
		this.num = num;
		this.book = book;
		this.order = order;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "OrderLine [id=" + id + ", num=" + num + ", book=" + book + "]";
	}
	
}
