package bruce.newsham.NLAProgrammingExercise.service;

/**
 * Interface for Book service
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.List;

import bruce.newsham.NLAProgrammingExercise.entity.Book;

public interface IBookService {
	Book create(Book book);
    List<Book> findAll();
}