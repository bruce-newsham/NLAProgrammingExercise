package bruce.newsham.NLAProgrammingExercise.dao;

/**
 * DAO Interface for Author table
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import org.springframework.data.jpa.repository.JpaRepository;

import bruce.newsham.NLAProgrammingExercise.entity.Author;

public interface IAuthorDAO extends JpaRepository<Author, Long> {

}