package barath.springframework.chucknorrisforactuator.controllers;

import barath.springframework.chucknorrisforactuator.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})

    public String showJoke(Model model) {
          model.addAttribute("Jokes",jokeService.getJokes());

          return "index";
    }
}

