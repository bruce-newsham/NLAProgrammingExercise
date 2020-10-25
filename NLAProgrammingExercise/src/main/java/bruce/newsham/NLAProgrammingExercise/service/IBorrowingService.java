package bruce.newsham.NLAProgrammingExercise.service;

/**
 * Interface for Borrowing service
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.List;

import bruce.newsham.NLAProgrammingExercise.entity.Borrowing;

public interface IBorrowingService {
	Borrowing create(Borrowing borrowing);
    List<Borrowing> findAll();
	List<Borrowing> getBorrowingByReader(Long readerId);
}