package com.example.bookTest.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookTest.Dto.BookDto;

@Controller
public classs BookController {
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("index");
		
		return mv;
	}
	@GetMapping("/bookWrite")
	public ModelAndView write() {
		ModelAndView mv=new ModelAndView("book/bookForm");
		mv.addObject("count",5);
		return mv;
	}
	
	@PostMapping("/enroll")
	public String write(@ModelAttribute BookDto bookDto) {
		
		
		return "index";
	}
}
