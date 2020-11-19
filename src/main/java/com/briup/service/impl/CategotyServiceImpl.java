package com.briup.service.impl;

import java.util.List;

import com.briup.bean.Category;
import com.briup.dao.CategoryDao;
import com.briup.service.ICategotyService;
import com.briup.util.BriupUtil;

public class CategotyServiceImpl implements ICategotyService {

	private CategoryDao dao = BriupUtil.getMapper(CategoryDao.class);

	public List<Category> findAllCategories() {
		List<Category> list = dao.findAllCategories();
		return list;
	}

}
