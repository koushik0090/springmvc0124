package com.deloitte.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deloitte.model.HelloWorld;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloworld")
	public String handler(Model modelForView) {
		
		HelloWorld helloWorld = new HelloWorld();
		
		helloWorld.setMessage("Hey Team !!! Welcome to Spring MVC Training !!!!");
		helloWorld.setDateTime(LocalDateTime.now().toString());
		
		modelForView.addAttribute("helloworld",helloWorld);
		
		return "hellopage";
	}
	
	

}
