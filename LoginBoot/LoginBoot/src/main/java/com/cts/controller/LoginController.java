package com.cts.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.bean.LoginBean;
import com.cts.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	@RequestMapping("/")
	public String showLoginPage(Model model){
		model.addAttribute(new LoginBean());
		return "login";
	}
	
	@RequestMapping(value="/validate", method=RequestMethod.POST)
	public String checkLogin(
			@ModelAttribute @Valid LoginBean loginBean,
			BindingResult result,Model model){
		loginService.validate(loginBean, result);
		if(result.hasErrors()){
			return "login";
		}else{
if(loginBean.getUsername().equals(loginBean.getPassword())){
	model.addAttribute("username", loginBean.getUsername());
	return "success";
	}
		}
		return "login";
	}
	
}
