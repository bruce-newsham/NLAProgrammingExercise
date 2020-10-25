package bruce.newsham.NLAProgrammingExercise.service.impl;

/**
 * Service for Reader
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bruce.newsham.NLAProgrammingExercise.dao.IReaderDAO;
import bruce.newsham.NLAProgrammingExercise.entity.Reader;
import bruce.newsham.NLAProgrammingExercise.service.IReaderService;

@Service
public class ReaderService implements IReaderService {
    @Autowired
    private IReaderDAO dao;

    @Override
    public Reader create(Reader reader) {
        return dao.save(reader);
    }

	@Override
	public List<Reader> findAll() {
		return dao.findAll();
	}
}