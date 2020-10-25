package bruce.newsham.NLAProgrammingExercise.dao;

import java.util.List;

/**
 * DAO Interface for Borrowing table
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import org.springframework.data.jpa.repository.JpaRepository;

import bruce.newsham.NLAProgrammingExercise.entity.Borrowing;

public interface IBorrowingDAO extends JpaRepository<Borrowing, Long> {
	List<Borrowing> findByReaderId(Long readerId);

}