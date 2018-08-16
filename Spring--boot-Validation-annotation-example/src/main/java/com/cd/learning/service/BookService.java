package com.cd.learning.service;

import java.util.List;

import com.cd.learning.model.Book;

public interface BookService {
	public void addBook(Book book);
	public void deleteBook(Book book);
	public void updateBook(Book book);
	public List<Book>getAllBookInfo();
}
