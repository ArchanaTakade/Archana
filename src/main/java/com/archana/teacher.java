package com.archana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class teacher {
	
	@GetMapping("/name")
	public ModelAndView teacherName() {
        ModelAndView mv = new ModelAndView();
		mv.addObject("data","hello teacher, we are in teacher name method");
		mv.setViewName("index.jsp");
		return mv;
	}
	
	@GetMapping("/address")
	public ModelAndView teacherAddress() {
		 ModelAndView mv = new ModelAndView();
			mv.addObject("data","hello teacher, we are in teacher address method");
			mv.setViewName("index.jsp");
			return mv;
	
	
	}
	
	@GetMapping("/class")
	public ModelAndView teacherclass() {
		 ModelAndView mv = new ModelAndView();
			mv.addObject("data","hello teacher, we are in teacher class method");
			mv.setViewName("index.jsp");
			return mv;
	
	
	}

}
