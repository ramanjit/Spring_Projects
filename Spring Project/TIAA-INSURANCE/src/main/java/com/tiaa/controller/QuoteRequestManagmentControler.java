package com.tiaa.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class QuoteRequestManagmentControler {
	
	@GetMapping(path = "/quoteRequests")
	public String listRequests()
	{
		return "quoteRequestList";
	}
	
	@GetMapping("/quoteRequest/{quoteId}")
	public ModelAndView viewQuoteRequest(@PathVariable int quoteId)
	{
			QuoteRequest quoteRequestBean = new QuoteRequest();
			quoteRequestBean.setBudget(5000);
			quoteRequestBean.setEventType("wedding");
			
			ModelAndView mav = new ModelAndView();
			mav.addObject("quoteRequestBean", quoteRequestBean);
			mav.setViewName("quoteRequestDetail");
			
			
	//refer to quoteId in my implementation
	return mav;	
	}
	
	@GetMapping("/quoteRequest/social/{id}")
	
	public String viewRequestSocial(@PathVariable int id)
	{
		String returnViewName = "quoteRequestSocailEventDetail";
		boolean someCondition = true;
		if(someCondition)
		{
			returnViewName = "redirect://quoteRequest/wedding/{id}";
		}
		return returnViewName;
		
	}
	
	
	@GetMapping
	@ResponseBody
	public QuoteRequest viewQuoteRequestApi()
	{
		QuoteRequest quoteRequest =  new QuoteRequest();
		quoteRequest.setBudget(5000);
		return quoteRequest;
	}
	
	@PostMapping("/quoteDetail")
	public String updateQuteRequest(@ModelAttribute QuoteRequest formBean)
	{
		
	//implement a save of all of the form bean information
		return "quoteRequestList";	
	}
	
	
	public String viewQuoteRequest()
	{
		return "quoteRequestDetailt";	
	}
	
	@ModelAttribute
	public void addCommonAttribute(@RequestParam String eventType, Model model) {
		
		String customMessage = "You are viewing request for " + eventType;
		model.addAttribute("eventTypeMessage", customMessage);
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyy-mm-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor
				(dateFormat, false));
	}

}
