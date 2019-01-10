package springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	//���� thymeleaf ҳ��
	@RequestMapping("/hello")
    public String hello() throws Exception {
        
        return "hello";
    }
	
	//���� jsp ҳ��
	@RequestMapping("/hellojsp")
    public String hellojsp() throws Exception {
        
        return "jsp/hello";
    }
}
