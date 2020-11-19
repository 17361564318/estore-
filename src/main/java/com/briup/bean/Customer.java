package com.briup.bean;
/**
 * 顾客类
 * @author admin
 *
 */
public class Customer {
	private Integer id;
	private String username;
	private String password;
	private String zip;
	private String address;
	private String phone;
	private String email;
	
	public Customer() {
	}
	public Customer(Integer id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Customer(String username, String password, String zip, String address, String phone,
			String email) {
		this.username = username;
		this.password = password;
		this.zip = zip;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public Customer(Integer id, String username, String password, String zip, String address, String phone,
			String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.zip = zip;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", password=" + password + ", zip=" + zip
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
