package bruce.newsham.NLAProgrammingExercise.controller;

/**
 * Controller for 'Reader' page
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

import bruce.newsham.NLAProgrammingExercise.service.IBorrowingService;
import bruce.newsham.NLAProgrammingExercise.service.IReaderService;

@Controller

@RequestMapping("/reader")
public class ReaderController {

	@Autowired
	IReaderService readerService;
	
	@Autowired
	IBorrowingService borrowingService;

	
    @RequestMapping(value = "/readers", method = RequestMethod.GET)
    public String init(@ModelAttribute("model") ModelMap model) {
        @SuppressWarnings("rawtypes")
		List readerList = readerService.findAll();
        model.addAttribute("readerList", readerList);
        return "reader/readerPage";
    }
}