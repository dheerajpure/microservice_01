package dp.example.ms1.app1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/test")
	public String sayHello() {
		return "Swagger Hello World";
	}
}