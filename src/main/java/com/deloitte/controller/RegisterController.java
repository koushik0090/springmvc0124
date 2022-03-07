package com.deloitte.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.dao.UserDao;
import com.deloitte.model.Register;

@Controller
public class RegisterController {

	@Autowired
	UserDao userDaoObject;
	
	@RequestMapping(value="/showRegisterPage",method = RequestMethod.GET)
	public String showRegisterPage() {
		
		return "register";
	}
	
	@ModelAttribute("registerModel")
	public Register setRegisterForm() {
		return new Register();
	}
	
	
	@RequestMapping(value = "/registerUser",method = RequestMethod.POST)
	public ModelAndView registerUser(@Valid @ModelAttribute("registerModel") Register register, BindingResult errorResults) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		if(errorResults.hasErrors()) {
		
			modelAndView.setViewName("register");
			return modelAndView;
	
		}else {
		
			try {
					boolean isUserSaved = userDaoObject.registerUser(register);
					System.out.println("****User Saved successfully*****"+isUserSaved);
					modelAndView.setViewName("success");
					
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			return modelAndView;
		}
	}
	
	
	
}
