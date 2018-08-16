package com.cd.learning.dao;

import java.util.List;

import com.cd.learning.model.Book;

public interface BookDao {

	public void addBook(Book book);
	public void deleteBook(Book book);
	public void updateBook(Book book);

	public List<Book> getALlRecordBook();
}
