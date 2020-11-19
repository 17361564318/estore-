package com.briup.dao;

import java.util.List;

import com.briup.bean.Address;

public interface AddressDao {
	List<Address> findByCustomer(Integer id);

	void saveAddress(Address address);
}
