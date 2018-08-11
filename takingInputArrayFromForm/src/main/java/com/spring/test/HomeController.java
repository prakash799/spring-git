package com.spring.test;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@ModelAttribute
	public TestModel initModel(){
		return new TestModel();
		
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String openHome(){
		return "index";
	}
	
	
	@RequestMapping(value="submitData",method=RequestMethod.POST)
	public String submitFormData(@RequestParam(name="name",required=false)List<String> name, @ModelAttribute("formData")TestModel test, Model model){
		
		model.addAttribute("name", name);
		return "success";
	}
}
