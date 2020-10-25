package bruce.newsham.NLAProgrammingExercise.service.impl;

/**
 * Service for Borrowing
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bruce.newsham.NLAProgrammingExercise.dao.IBookDAO;
import bruce.newsham.NLAProgrammingExercise.dao.IBorrowingDAO;
import bruce.newsham.NLAProgrammingExercise.dao.IReaderDAO;
import bruce.newsham.NLAProgrammingExercise.entity.Borrowing;
import bruce.newsham.NLAProgrammingExercise.service.IBorrowingService;

@Service
public class BorrowingService implements IBorrowingService {
    @Autowired
    private IBorrowingDAO dao;
    
    @Autowired
    IReaderDAO readerDAO;
    
    @Autowired
    IBookDAO bookDAO;

    @Override
    public Borrowing create(Borrowing borrowing) {
        return dao.save(borrowing);
    }

	@Override
	public List<Borrowing> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Borrowing> getBorrowingByReader(Long readerId) {
		List<Borrowing> result = dao.findByReaderId(readerId);
		return result;
	}
}