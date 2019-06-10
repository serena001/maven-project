package hello;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@SessionAttributes({"work1"})
public class WelcomeController extends ApplicationSupport1{
	@Autowired
	UserHelper userHelper;
	
		@Value("${application.message:Hello World}")
		private String message = "Hello World";		
		
		//Use it for all closses This works for the breadcrumbs.  It will call the applicationSupport class to build home link and then add its own link for the page
		@ModelAttribute("breadcrumbs")
		public String breadCrumbOjbect()
		{
			return createBreadCrumb();
		}
		
		
		
		@GetMapping("/welcome")
		//public String welcome(Map<String, Object> model,HttpServletRequest request, @ModelAttribute("work1") String work1) {
		public String welcome(Map<String, Object> model,HttpServletRequest request) {

			//System.out.println("welcome1"+request.getAttribute("work"));
			//System.out.println("Welcome"+request.getSession().getAttribute("work1"));
		//	request.getSession().getAttribute("work1");
		//	getUser();
			model.put("time", new Date());
			model.put("message", this.message);
			//System.out.println("work11" + work1);
			System.out.println("afsf");
		    System.out.println("moonraker cache" + userHelper.getText1());

			return "redirect:welcome";
		}
		@GetMapping("/welcome2")
		public String welcome2(Map<String, Object> model,HttpServletRequest request)
		{
	//		String clientObject=request.getSession().getAttribute("clientObject").toString();
	//		System.out.println("clientObject"+clientObject);
			model.put("time", new Date());
			model.put("message", this.message + "hi2222");
		    System.out.println("moonraker cache" + userHelper.getText1());

//			modelAndView.addObject("ddd", "sdf");
			return "welcome";
		}

}
