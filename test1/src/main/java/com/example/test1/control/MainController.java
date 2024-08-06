package com.example.test1.control;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.test1.DTO.LoginDto;
import com.example.test1.DTO.MemberDto;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {
	
	@GetMapping("/test")
	public String testFirst() {
		return "test";
	}

	@GetMapping("/aaa.g")
	public String testTwo() {
		return "login";
	}
	@GetMapping("/signUp")
	public String testThree() {
		return "member/signUp";
	}
	@PostMapping("/signUp")
	public String signUpSave(@RequestParam Map<String, String> pm) {
		
		System.out.println("세번째 방법:"+pm.get("id"));
		
		
		return "member/signUp";
	}
	
	@GetMapping("/")
	public ModelAndView home() {
		String title="이번 여름 바닷가는 다녀오셨습니다?";
		ModelAndView mv=new ModelAndView("index");
		
		
		mv.addObject("pageTitle",title);
		return mv;
	}

	
	
	@GetMapping("/login")
	public String login() {
		
		
		return "login";
	}
	@PostMapping("/login")
	public String login( @ModelAttribute LoginDto logindto) {
		
		
		System.out.println(logindto.getUserId());
		
		return "loginResult";
	}
//	@PostMapping("/signUp")
//	public String signUpSave(@ModelAttribute MemberDto memberDto) {
//		
//		System.out.println("두번째 방법: "+memberDto.getId());
//		
//		return "member/signUp";
//		
//	}
//	@PostMapping("/signUp")
//	public String signUpSave(@RequestParam("id") String id,
//			@RequestParam("pw") String pw,@RequestParam("tel") String tel,
//			@RequestParam("birth") String birth) {
//		
//		
//		System.out.println(id);
//		
//		return "member/signUp";
//	}
}

// 자바빈:1.클래스의 인스턴스변수는 input의 name과 일치 시켜준다.
//	   :2.클래스의 기본생성자 메서드가 필요하다.
//     :3.인스턴스변수의 get,set 메서드
//	   :4.인스턴스의 제어자는 private	





















