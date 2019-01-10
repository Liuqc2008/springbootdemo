package springboot.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springboot.web.interceptor.FirstInterceptor;

@SuppressWarnings("deprecation")
@Configuration
public class WebMvcConfigurerAdapterConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new FirstInterceptor()).addPathPatterns("/**");
	}
}
