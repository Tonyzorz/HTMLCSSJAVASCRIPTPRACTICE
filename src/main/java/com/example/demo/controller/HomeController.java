package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "/index";
	}
	@RequestMapping("/testing1")
	public String testing1() {
		return "/testing1";
	}
	
	@RequestMapping("/yahooMini")
	public String yahooMini() {
		return "yahooMini";
	}
	
	@RequestMapping("/practicing")
	public String practicing() {
		return "practicing";
	}
	@RequestMapping("/sixteenthHTML")
	public String sixteenthHTML() {
		return "sixteenthHTML";
	}
	@RequestMapping("/seventeenthhtml")
	public String seventeenthhtml() {
		return "seventeenthhtml";
	}
}
