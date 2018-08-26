package com.spring.test;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@Autowired
	@Qualifier("registrationvalidator")
	UserValidation userValidator;
	
	
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
	
	
	@RequestMapping(value="goToRegistrationPage",method=RequestMethod.GET)
	public String openRegistationForm(Model model){
		if(!model.containsAttribute("user")){
			model.addAttribute("user", new User());
		}
		return "registration";
	}
	
	@RequestMapping(value="doReg",method=RequestMethod.POST)
	public String doRegistationForm(@Valid @ModelAttribute("user")User user,Model model,BindingResult result,RedirectAttributes redirectAttributes){
		if((user.getFirstName())!=null||user.getEmail()!=null||user.getLastName()!=null||user.getPassword()!=null||user.getAddress()!=null){
			this.userValidator.validate(user, result);
			if(result.hasErrors()){
				redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.user", result);
				redirectAttributes.addFlashAttribute("user", user);
				return "redirect:/goToRegistrationPage";
			}else{
				
			}
		}
		return "success";
	}
}