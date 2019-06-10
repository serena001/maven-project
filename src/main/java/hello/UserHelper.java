package hello;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev"})
public class UserHelper {
String text;
	public String getText()
	{
		return "Hello man11";
	}
	@Cacheable("names")
	public String getText1()
	{
		return text;
	}
	public void setText(String name)
	{
		this.text=name;
	}
}


