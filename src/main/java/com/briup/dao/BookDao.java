package com.briup.dao;

import java.util.List;

import com.briup.bean.Book;

public interface BookDao {

	List<Book> findAllBooks();
	
	Book findBookById(Integer id);
}
