package com.raman.ShoppingCart;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raman.models.Page;
import com.raman.models.PageRepository;

@Controller
@RequestMapping("/admin/pages")
public class AdminPagesController {
	
	@GetMapping
	public String index()
	{
		return "admin/pages/index";
		
	}
	
	/*
	private PageRepository  pageRepo;
	
	public AdminPagesController(PageRepository  pageRepo){
		this.pageRepo = pageRepo;
	}
	
	//Passing model
	@GetMapping
	public String index(Model model)
	{
		//All the pages will be here
		
		List<Page> pages  = pageRepo.findAll();
		
		//Passing pages to view - use index(Model model) and attributes
		
		model.addAttribute("pages",pages);
		
		return "admin/pages/index";
	}
	*/

}
