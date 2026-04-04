package in.scalive.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET,value="/showdate")
	public ModelAndView showDateTime() {
		ModelAndView mv=new ModelAndView();
		Date today=new Date();
		mv.addObject("dt",today);		
		mv.addObject("msg", "Happy New Year");
		mv.setViewName("demo.jsp");
		return mv;
	}
	
}
