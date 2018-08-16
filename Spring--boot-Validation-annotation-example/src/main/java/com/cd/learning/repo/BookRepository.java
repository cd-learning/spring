package com.cd.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cd.learning.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {


}
