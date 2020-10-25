package bruce.newsham.NLAProgrammingExercise.controller;

/**
 * Controller for 'Books' page
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bruce.newsham.NLAProgrammingExercise.entity.Book;
import bruce.newsham.NLAProgrammingExercise.service.IBookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	IBookService bookService;

	
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String init(@ModelAttribute("model") ModelMap model) {
    	List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "book/bookPage";
    }

}