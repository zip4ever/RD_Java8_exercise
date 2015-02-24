package com.realdolmen.education.java8.repository;

import com.realdolmen.education.java8.domain.Book;

import java.util.List;

/**
 * Created by KDAAU95 on 24/02/2015.
 */
public interface BookRepository {

    List<Book> getBooks();

    // other methods omitted
}
