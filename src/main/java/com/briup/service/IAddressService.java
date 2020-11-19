package com.briup.service;

import java.util.List;

import com.briup.bean.Address;

public interface IAddressService {
	List<Address> findByCustomer(Integer id);

	void saveAddress(Address address);
}
