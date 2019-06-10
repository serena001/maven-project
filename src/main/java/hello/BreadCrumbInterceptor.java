package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author cjchow
 * Used to change the breadcrumbs for each view
 *
 */
public class BreadCrumbInterceptor extends HandlerInterceptorAdapter{
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView modelAndView)
	{
		String viewName;
		if(modelAndView!=null)
		{			
			viewName=modelAndView.getViewName();
			System.out.println("view" + modelAndView.getViewName());
			//Call the method to create the home link
			if(viewName.equals("welcome2"))
			{
				modelAndView.addObject("breadcrumbs1", "http://canada.ca");
			}
			else if(viewName.equals("welcome"))
			{
				modelAndView.addObject("breadcrumbs1", "http://yahoo.com");
			}
		}
		//Must consider if it is a redirect not to send again already set.  
	}
}
