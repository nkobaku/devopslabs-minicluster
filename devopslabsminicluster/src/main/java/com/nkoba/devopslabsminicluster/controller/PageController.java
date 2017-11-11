package com.nkoba.devopslabsminicluster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", "Welcome to DEVOPS MINICLUSTER");
		
		return mv;
	}
	
	@RequestMapping(value={"/test"})
	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting){
		System.out.println("In test() method");
		//null check
		if(greeting==null){
			greeting="Hello..!!";					
		}
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", greeting);		
		return mv;
	}
	
	@RequestMapping(value={"/test/{greeting}"})
	public ModelAndView test1(@PathVariable("greeting")String greeting){
		System.out.println("In test1() method");
		//null check
		if(greeting==null){
			greeting="Hello..!!";					
		}
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", greeting);		
		return mv;
	}
}
