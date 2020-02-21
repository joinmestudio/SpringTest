package com.controller;
import com.model.*;
import com.validate.CustomValidator;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

	@Autowired
	private CustomValidator custValidator;
	
	@RequestMapping(value="/registerPage",method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute("register", new RegistrationBean());
		
		return "registrationpage";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	  public String performRegistration(@ModelAttribute("register") @Valid RegistrationBean  registrationBean,BindingResult result) {
		custValidator.validate(registrationBean , result);
		if(result.hasErrors()){
			return "registrationpage";
		}
		else{
		  
		//model.addAttribute("userName", registrationBean.getUserName());
		//model.addAttribute("emailId", registrationBean.getEmailId());
			
			return "thankyou";
		}
		
	}	 	  		    	    	     	      	 	
}
