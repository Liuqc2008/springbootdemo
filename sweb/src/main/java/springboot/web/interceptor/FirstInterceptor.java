package springboot.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class FirstInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handle) 
			throws Exception{
		System.out.println("preHandle");
		return true;
	}
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, 
		Object handle, ModelAndView modelAndView) throws Exception{
		
		System.out.println("postHandle");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
		Object handle, Exception ex) throws Exception{
		
		System.out.println("afterCompletion");
	}
}
