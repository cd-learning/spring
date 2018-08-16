package com.cd.learning.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	private int bookId;
	private String bookName; // who will cry on when you die

	private String author; // rohit,devang
	private String publisher; // line naavneet,or atulprakshan

	private int copyrightYear; // 2009,2010,etc
	private String editor; // Editor name;
	private String bookLanguage; // english edition ,gujrati,hindi or
	private Boolean videoCopy; // its copy is avilable or not
	private Boolean abridged; // Indicates whether the book is an abridged edition.
	private String bookEdition; // The edition of the book.
	private String illustrator;
	private String isbn; // 16 degit code bar code.....
	private String about; // Descriptoin of book
	private String url;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}





	public int getCopyrightYear() {
		return copyrightYear;
	}

	public void setCopyrightYear(int copyrightYear) {
		this.copyrightYear = copyrightYear;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getBookLanguage() {
		return bookLanguage;
	}

	public void setBookLanguage(String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}

	public Boolean getVideoCopy() {
		return videoCopy;
	}

	public void setVideoCopy(Boolean videoCopy) {
		this.videoCopy = videoCopy;
	}

	public Boolean getAbridged() {
		return abridged;
	}

	public void setAbridged(Boolean abridged) {
		this.abridged = abridged;
	}

	public String getBookEdition() {
		return bookEdition;
	}

	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}

	public String getIllustrator() {
		return illustrator;
	}

	public void setIllustrator(String illustrator) {
		this.illustrator = illustrator;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
