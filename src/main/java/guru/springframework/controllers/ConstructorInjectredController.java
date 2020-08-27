package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class ConstructorInjectredController {

	
	private final GreetingService greetingService;

	@Autowired  //not required though
	public ConstructorInjectredController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
	
		this.greetingService = greetingService;
	}
	
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
