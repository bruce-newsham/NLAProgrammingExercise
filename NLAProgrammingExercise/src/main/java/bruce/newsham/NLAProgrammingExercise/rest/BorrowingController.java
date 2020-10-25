package bruce.newsham.NLAProgrammingExercise.rest;

/**
 * Controller for Borrowing Rest service
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bruce.newsham.NLAProgrammingExercise.entity.Borrowing;
import bruce.newsham.NLAProgrammingExercise.rest.model.BorrowingResponse;
import bruce.newsham.NLAProgrammingExercise.rest.model.BorrowingSearchCriteria;
import bruce.newsham.NLAProgrammingExercise.service.IBorrowingService;

@RestController
public class BorrowingController {

	private static final String SUCCESS_MESSAGE = "success";
	private static final String NO_BORROWED_BOOKS_FOUND_MESSAGE = "No borrowed books found!";
	@Autowired
	IBorrowingService borrowingService;

    @PostMapping("/borrowedBooksByReader")
    public ResponseEntity<?> getBorrowedBooksByReader(
            @Valid @RequestBody BorrowingSearchCriteria search, Errors errors) {

    	BorrowingResponse result = new BorrowingResponse();

        List<Borrowing> borrowedBooks = borrowingService.getBorrowingByReader(search.getReader());
        if (borrowedBooks.isEmpty()) {
            result.setMsg(NO_BORROWED_BOOKS_FOUND_MESSAGE);
        } else {
            result.setMsg(SUCCESS_MESSAGE);
        }
        result.setResult(borrowedBooks);

        return ResponseEntity.ok(result);

    }

}
