package com.example.demo.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Uicontroller {
	
	@RequestMapping("/")
	public String index()
	{
		return "index.html";
	}
}
