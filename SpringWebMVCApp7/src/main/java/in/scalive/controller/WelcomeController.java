package in.scalive.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET,value="/showdate")
	public String showDateTime(HttpServletRequest req) {
		Date today=new Date();
		req.setAttribute("dt", today);
		return "demo.jsp";
	}
	
}
