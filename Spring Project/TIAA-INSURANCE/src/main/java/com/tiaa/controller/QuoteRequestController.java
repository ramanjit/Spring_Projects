package com.tiaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuoteRequestController {
	
	@GetMapping("/newquote")
	public String beginQuoteRequest(Model model){
		model.addAttribute("quoteRequestForm", new QuoteRequest());
		
		//add implementation
		return "newQuote";
	}
	
@PostMapping
public String submitQuoteRequest(){
		
	//add implemented later
		return "newQuoteConfiramation";
	}
	
}
