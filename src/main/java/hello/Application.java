package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@SpringBootApplication
public class Application{
//asfggg
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//    @Bean 
//    public FreeMarkerViewResolver freemarkerViewResolver() { 
//        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver(); 
//        resolver.setCache(true); 
//        resolver.setPrefix(""); 
//        resolver.setSuffix(".ftlh"); 
//        resolver.setRequestContextAttribute("rc");
//        return resolver; 
//    }
//    @Bean
//    public MessageSource messageSource()
//    {
//    		ReloadableResourceBundleMessageSource rMessageSource = new ReloadableResourceBundleMessageSource();
//    		rMessageSource.setBasenames("classpath:messages");
//    		return rMessageSource;
//    }
//    @Bean 
//    public FreeMarkerConfigurer freemarkerConfig() { 
//        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer(); 
//        freeMarkerConfigurer.setTemplateLoaderPath("/WEB-INF/views/ftl/");
//        return freeMarkerConfigurer; 
//    }

}
