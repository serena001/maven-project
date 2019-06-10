package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//@Slf4j
public class LoginUserInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
	{
		//do not use this yet 
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView modelAndView)
	{
		String clientObject="something";
		String username = "carol";
		//Set client information
	
		req.getSession().setAttribute("clientObject", clientObject);
		if(modelAndView!=null)
		{
		//	modelAndView.addObject("username", username);
		}
		System.out.println("ha ha ha ha ");
	}
	//add method to check if the user is logged in
	protected boolean isUserLoggedIn()
	{
		//Add information to check authentication
		return true;
	}
}
