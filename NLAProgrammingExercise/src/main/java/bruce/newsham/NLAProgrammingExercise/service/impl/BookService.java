package bruce.newsham.NLAProgrammingExercise.service.impl;

/**
 * Service for Book
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bruce.newsham.NLAProgrammingExercise.dao.IBookDAO;
import bruce.newsham.NLAProgrammingExercise.entity.Book;
import bruce.newsham.NLAProgrammingExercise.service.IBookService;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookDAO dao;

    @Override
    public Book create(Book book) {
        return dao.save(book);
    }

	@Override
	public List<Book> findAll() {
		return dao.findAll();
	}
}