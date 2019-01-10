package springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	//返回 thymeleaf 页面
	@RequestMapping("/hello")
    public String hello() throws Exception {
        
        return "hello";
    }
	
	//返回 jsp 页面
	@RequestMapping("/hellojsp")
    public String hellojsp() throws Exception {
        
        return "jsp/hello";
    }
}
