package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.switchuser.SwitchUserFilter;

@Profile({"dev"})
@Configuration("devApplicationSecurity")
@Order(SecurityProperties.BASIC_AUTH_ORDER-1)
public class ApplicationSecurity extends WebSecurityConfigurerAdapter{
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
			.csrf().disable()
			.addFilter(switchUserFilter());
	}
	@Bean
	public SwitchUserFilter switchUserFilter() {
		final SwitchUserFilter switchUserFilter = new SwitchUserFilter();
		switchUserFilter.setUserDetailsService(userDetailsService);
		switchUserFilter.setUsernameParameter("Penny");
		switchUserFilter.setTargetUrl("/welcome");
		return switchUserFilter;
		
	}
}
