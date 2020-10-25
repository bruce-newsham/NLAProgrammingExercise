package bruce.newsham.NLAProgrammingExercise.service;

/**
 * Interface for Author service
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.List;

import bruce.newsham.NLAProgrammingExercise.entity.Author;

public interface IAuthorService {
	Author create(Author author);
    List<Author> findAll();
}