package com.briup.bean;

import java.io.Serializable;

/**
 * 收货地址(此处的地址和cuatomer中的地址是不一样的)
 * @author admin
 *
 */
public class Address implements Serializable{
	private String addrName;
	private String addrDetail;
	private String addrPhone;
	private Integer customerId;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String addrName, String addrDetail, String addrPhone, int customerId) {
		this.addrName = addrName;
		this.addrDetail = addrDetail;
		this.addrPhone = addrPhone;
		this.customerId = customerId;
	}
	public String getAddrName() {
		return addrName;
	}
	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}
	public String getAddrDetail() {
		return addrDetail;
	}
	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}
	public String getAddrPhone() {
		return addrPhone;
	}
	public void setAddrPhone(String addrPhone) {
		this.addrPhone = addrPhone;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		return "Address [addrName=" + addrName + ", addrDetail=" + addrDetail + ", addrPhone=" + addrPhone
				+ ", customerId=" + customerId + "]";
	}
	

}
