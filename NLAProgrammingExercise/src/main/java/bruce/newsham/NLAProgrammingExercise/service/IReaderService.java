package bruce.newsham.NLAProgrammingExercise.service;

/**
 * Interface for Reader service
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.List;

import bruce.newsham.NLAProgrammingExercise.entity.Reader;

public interface IReaderService {
	Reader create(Reader reader);
    List<Reader> findAll();
}