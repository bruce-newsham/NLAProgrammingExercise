package bruce.newsham.NLAProgrammingExercise.dao;

/**
 * DAO Interface for Reading table
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import org.springframework.data.jpa.repository.JpaRepository;

import bruce.newsham.NLAProgrammingExercise.entity.Reader;

public interface IReaderDAO extends JpaRepository<Reader, Long> {

}