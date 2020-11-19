package com.briup.service.impl;

import java.util.List;

import com.briup.bean.Book;
import com.briup.dao.BookDao;
import com.briup.service.IBookService;
import com.briup.util.BriupUtil;

public class BookServiceImpl implements IBookService {
	BookDao dao = BriupUtil.getMapper(BookDao.class);

	public List<Book> findAllBooks() {
		List<Book> books = dao.findAllBooks();
		return books;
	}

	public Book findBookById(Integer id) {
		Book book = dao.findBookById(id);
		return book;
	}

}
