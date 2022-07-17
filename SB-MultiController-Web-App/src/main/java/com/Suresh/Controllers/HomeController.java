package com.Suresh.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String displayHomePage(Model model)
	{
		model.addAttribute("msg","This is Home page ");
		
		return "homePage";
		
	}

}
