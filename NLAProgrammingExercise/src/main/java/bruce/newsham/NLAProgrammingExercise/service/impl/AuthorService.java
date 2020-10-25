package bruce.newsham.NLAProgrammingExercise.service.impl;

/**
 * Service for Author
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bruce.newsham.NLAProgrammingExercise.dao.IAuthorDAO;
import bruce.newsham.NLAProgrammingExercise.entity.Author;
import bruce.newsham.NLAProgrammingExercise.service.IAuthorService;

@Service
public class AuthorService implements IAuthorService {
    @Autowired
    private IAuthorDAO dao;

    @Override
    public Author create(Author author) {
        return dao.save(author);
    }

	@Override
	public List<Author> findAll() {
		return dao.findAll();
	}
}