package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry)
	{
		registry.addInterceptor(loginUserInterceptor());
		registry.addInterceptor(breadCrumbInterceptor());

	}
	//Add as a bean
	@Bean BreadCrumbInterceptor breadCrumbInterceptor()
	{
		return new BreadCrumbInterceptor();
	}
	//Add as a bean
	@Bean LoginUserInterceptor loginUserInterceptor()
	{
		return new LoginUserInterceptor();
	}
}
