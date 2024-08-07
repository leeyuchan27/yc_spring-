package com.example.bookTest.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookTest.Dto.BankDto;
import com.example.bookTest.Dto.BookInfoDto;

import com.example.bookTest.Dto.InfoDto;


@Controller
public class HomeController {

	@GetMapping("/home")
	public String homeView() {
		return "home";
	}
	
	@GetMapping("/infoInput")
	public ModelAndView info(@ModelAttribute InfoDto infoDto) {
		
		
		ModelAndView mv=new ModelAndView("info");
		
		String byear=infoDto.getUBirth().substring(0,4);
		
		int age=2024-Integer.parseInt(byear);
		
		mv.addObject("ageData",age);
		
		return mv;
	}
	
	@GetMapping("/write")
	public String bookWrite() {
		
		return "bookWrite";
	}
	
	@GetMapping("/detail")
	public ModelAndView bookDetail(@ModelAttribute BookInfoDto bookInfoDto) {
		ModelAndView mv=new ModelAndView("bookDetail");
		mv.addObject("book",bookInfoDto);
		return mv;
		
		
	}
	@GetMapping("/input")
	public String bankInput() {
		return "bank";
	}
	@GetMapping("/result")
	public ModelAndView bankdd(@ModelAttribute BankDto bankDto) {
		ModelAndView mv=new ModelAndView("result");
		mv.addObject("bank",bankDto);
		return mv;
		
	}
}
