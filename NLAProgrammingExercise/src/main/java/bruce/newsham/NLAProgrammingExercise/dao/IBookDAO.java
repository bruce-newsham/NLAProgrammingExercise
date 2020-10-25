package bruce.newsham.NLAProgrammingExercise.dao;

/**
 * DAO Interface for Book table
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import org.springframework.data.jpa.repository.JpaRepository;

import bruce.newsham.NLAProgrammingExercise.entity.Book;


public interface IBookDAO extends JpaRepository<Book, Long> {

}