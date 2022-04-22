package guru.springframework.springjokesApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.springjokesApp.services.JokeService;

@Controller
public class JokeController {
	
	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	//Root
	@RequestMapping({"/",""})
	public String showJoke(Model m) {
		
		m.addAttribute("joke",jokeService.getJoke());
		return "index";
	}
	
	
	

}
