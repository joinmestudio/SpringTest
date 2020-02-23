package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController {

	
	/*
	 * After adding org.apache.tomcat(group-id)
	 * and tomcat-jasper(artifactId ) it will work fine
	 * */
	
	
	@RequestMapping("home")
	public String home() {
		System.out.println("home");
		return "home.jsp";
		
	}
	//after customized configuration in properties file
	@RequestMapping("home2")
	public String home2() {
		System.out.println("home2");
		return "home";
		
	}
	
	
	@RequestMapping("home1")
	@ResponseBody
	public String home1() {
		System.out.println("home1");
		return "home.jsp";
		
	}
	
	@RequestMapping("homeReq")
	public String homeReq(HttpServletRequest req,HttpSession session) {
		String name = req.getParameter("name");
		
		System.out.println("homeReq"+name);
		//req.setAttribute("name", name+"req obj");
		req.getSession().setAttribute("name", name+"session obj");
		
		return "homeReq";
		
	}
	
	@RequestMapping("homeReq1")
	public String homeReq1(@RequestParam("name") String name,HttpSession session) {
		
		
		System.out.println("homeReq1"+name);
		//req.setAttribute("name", name+"req obj");
		session.setAttribute("name", name+"session obj");
		
		return "homeReq";
		
	}
	
	@RequestMapping("homeReq2")//use model and view (insted of session)
	public ModelAndView homeReq1(@RequestParam("name") String name) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("homeReq");
		mv.addObject("name",name);
		System.out.println("homeReq2"+name);
		return mv;
		
	}
	
	
	
	
	
	
	@RequestMapping("objData")
	public ModelAndView objData(Engine engine) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("objData");
		mv.addObject("engine",engine);
		System.out.println("objData");
		return mv;
		
	}
	
	
	
	
	@RequestMapping(value= "inter")
    public String initView() {
        System.out.println("Handler method is called.");
        return "internationalization";
    }
}
