package com.example.test1.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String signUpSave(@RequestParam("id") String id,
			@RequestParam("pw") String pw,@RequestParam("tel") String tel,
			@RequestParam("birth") String birth) {
		
		
		System.out.println(id);
		
		return "member/signUp";
	}
}
