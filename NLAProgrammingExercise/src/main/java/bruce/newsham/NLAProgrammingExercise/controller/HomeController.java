package bruce.newsham.NLAProgrammingExercise.controller;

/**
 * Controller for 'home/index' page
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "redirect:/home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String init(@ModelAttribute("model") ModelMap model) {
		return "index";
	}

}