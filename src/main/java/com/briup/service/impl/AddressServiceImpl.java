package com.briup.service.impl;

import java.util.List;

import com.briup.bean.Address;
import com.briup.dao.AddressDao;
import com.briup.service.IAddressService;
import com.briup.util.BriupUtil;

public class AddressServiceImpl implements IAddressService {
	AddressDao dao = BriupUtil.getMapper(AddressDao.class);

	@Override
	public List<Address> findByCustomer(Integer id) {
		List<Address> address = dao.findByCustomer(id);
		return address;
	}

	@Override
	public void saveAddress(Address address) {
		dao.saveAddress(address);
	}

}
