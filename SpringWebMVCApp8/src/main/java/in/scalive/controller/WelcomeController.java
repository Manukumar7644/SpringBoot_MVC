package in.scalive.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET,value="/showdate")
	public String showDateTime(Model m) {
		Date today=new Date();
		m.addAttribute("dt", today);
		m.addAttribute("msg", "Happy New Year");
		return "demo.jsp";
	}
	
}
