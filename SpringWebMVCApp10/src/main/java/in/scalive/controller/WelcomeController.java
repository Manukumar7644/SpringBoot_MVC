package in.scalive.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {
       @RequestMapping(method=RequestMethod.GET,value="/")
	   public String homePage() {
		   return "home.html";
	   }
       @RequestMapping(method=RequestMethod.GET,value="/welcome")
       public String greetings(HttpServletRequest req,Model model) {
    	   //code
    	   String str=req.getParameter("username");
    	   model.addAttribute("name", str);
    	   return "greetings.jsp";
       }
	
	
}
