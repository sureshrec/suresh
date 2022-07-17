package com.Suresh.Controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DateController {
	
	@RequestMapping("/date")
	public ModelAndView DisplayDate()
	{
		ModelAndView mav= new ModelAndView();
		String msgTxt = "Hello, Today's date : " + new Date();
		mav.addObject("msg", msgTxt);
		mav.setViewName("displayData");
		 return mav;
		
	}

}
