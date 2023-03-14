package com.archana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class student {
	
	@GetMapping("/std")
	public ModelAndView msg() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("data","we are in student msg method");
		mv.setViewName("student.jsp");
		return mv;
	}
	
    @GetMapping("/std-list")
    public ModelAndView msg1() {
		System.out.println("we are in student msg method");
	        ModelAndView mv = new ModelAndView();
			mv.addObject("data","we are in student msg method");
			mv.setViewName("student.jsp");
			return mv;
		}

    
   
   @GetMapping("/std-address")
    public ModelAndView msg2() {
    	 System.out.println("we are in student msg method");
    		ModelAndView mv = new ModelAndView();
    		mv.addObject("data","we are in student msg method");
    		mv.setViewName("student.jsp");
    		return mv;
    	}
	
	
}
