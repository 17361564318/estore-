package com.briup.web.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.briup.bean.Book;
import com.briup.bean.Category;
import com.briup.service.IBookService;
import com.briup.service.ICategotyService;
import com.briup.service.impl.BookServiceImpl;
import com.briup.service.impl.CategotyServiceImpl;
public class ApplicationListener implements ServletContextListener {
	
    public ApplicationListener() {
        // TODO Auto-generated constructor stub
    }
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext context = sce.getServletContext();
    	//查询出来所有的一级分类和二级分类
    	ICategotyService service = new CategotyServiceImpl();
    	List<Category> list = service.findAllCategories();
    	//查询出来所有的书籍信息
    	IBookService bookservice = new BookServiceImpl();
    	List<Book> books = bookservice.findAllBooks();
    	//向整个应用中添加分类信息list和书籍信息books
    	context.setAttribute("list", list);
    	context.setAttribute("books", books);
    }
	
}
