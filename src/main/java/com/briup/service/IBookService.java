package com.briup.service;

import java.util.List;

import com.briup.bean.Book;

public interface IBookService {

	List<Book> findAllBooks();
	
	Book findBookById(Integer id);
}
