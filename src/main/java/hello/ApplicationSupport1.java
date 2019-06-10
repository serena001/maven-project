package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public abstract class ApplicationSupport1 {

	protected void getUser()
	{
		//USE THIS ONE
		System.out.println("testing");
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpSession session = attr.getRequest().getSession();
		session.getAttribute("something");
		System.out.println("testing2"+session.getAttribute("something"));
		System.out.println("testing2"+session.getAttribute("work1"));
		
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		System.out.println("testingagain" + request.getAttribute("work1"));
		
		//END OF USE THIS ONE
		
	;
	//Possible ways
		//https://stackoverflow.com/questions/559155/how-do-i-get-a-httpservletrequest-in-my-spring-beans
	/**	@Autowired
		private HttpServletRequest request;**/
		//or
	/**	HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder

		        .getRequestAttributes()).getRequest();**/
	}
	protected String createBreadCrumb()
	{
		return "http://www.canada.ca";
	}
}
