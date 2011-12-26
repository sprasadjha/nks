package com.nks.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping(value={"/test","/test/"}, method=RequestMethod.GET)
	public ModelAndView vwLeasingDataEditor(Model model){
		return new ModelAndView("test");
	}
}
