package com.cd.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cd.learning.model.Book;
import com.cd.learning.service.BookServiceImpl;

@RestController
public class BookController {

	@Autowired
	public BookServiceImpl bookService;

	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public ModelAndView gotoBookJsp() {
		return new ModelAndView("book", "command", new Book());
	}

	@RequestMapping(value = "/addBookInfo", method = RequestMethod.POST)
	public ModelAndView addBookInfo(@RequestParam String bookName, @RequestParam String author,
			@RequestParam String publisher, @RequestParam String editor, @RequestParam String bookEdition,
			@RequestParam String illustrator, @RequestParam String isbn, @RequestParam String about,
			@RequestParam String url) {

	 	System.out.println("bookName" + bookName);

		System.out.println("author" + author);
		System.out.println("publisher" + publisher);
		System.out.println("edito" + editor);
		System.out.println("bookEdition" + bookEdition);
		System.out.println("illustrator" + illustrator);
		System.out.println("isbn" + isbn);
		System.out.println("about" + about);
		System.out.println("url" + url);


       Book book=new Book();
       book.setBookId(1);
       book.setAuthor(author);
       book.setPublisher(publisher);
       book.setEditor(editor);
       book.setBookEdition(bookEdition);
       book.setIllustrator(illustrator);
       book.setIsbn(isbn);
       book.setAbout(about);
       book.setUrl(url);

       bookService.addBook(book);

		String msg = "....";
		return new ModelAndView("success", "msg", msg);

	}
}
