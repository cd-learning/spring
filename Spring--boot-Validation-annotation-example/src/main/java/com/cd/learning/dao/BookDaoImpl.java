package com.cd.learning.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cd.learning.model.Book;
import com.cd.learning.repo.BookRepository;

@Repository
public class BookDaoImpl implements BookDao{

	@Autowired
	public BookRepository repoBook;
	@Override
	public void addBook(Book book) {
		repoBook.save(book);
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		repoBook.delete(book);
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		repoBook.saveAndFlush(book);

	}

	@Override
	public List<Book> getALlRecordBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
