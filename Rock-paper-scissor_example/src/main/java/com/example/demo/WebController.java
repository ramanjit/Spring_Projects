package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@GetMapping("/playgame")
	public String playGame(@RequestParam(name="choice", required=false) String theChoice, Model model)
	{
		String theOutCome = "error";
		if(theChoice.equals("rock"))
		{
			theOutCome = "tie";
		}
		if(theChoice.equals("paper"))
		{
			theOutCome = "win";
		}
		if(theChoice.equals("scissor"))
		{
			theOutCome = "loss";	
		}
		model.addAttribute("outcome", theOutCome);
		return "result";
	}

}
