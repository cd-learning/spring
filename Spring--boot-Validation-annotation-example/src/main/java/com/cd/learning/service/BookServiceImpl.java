package com.cd.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cd.learning.dao.BookDaoImpl;
import com.cd.learning.model.Book;
@Service
public class BookServiceImpl implements BookService {


	@Autowired
	public BookDaoImpl bookDao;
	@Override
	public void addBook(Book book) {

		bookDao.addBook(book);
	}

	@Override
	public void deleteBook(Book book) {

		bookDao.deleteBook(book);
	}

	@Override
	public void updateBook(Book book) {

		bookDao.updateBook(book);
	}

	@Override
	public List<Book> getAllBookInfo() {

		return null;
	}

}
