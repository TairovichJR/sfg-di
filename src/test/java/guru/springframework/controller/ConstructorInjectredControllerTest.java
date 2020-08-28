package guru.springframework.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.services.ConstructorGreetingService;

public class ConstructorInjectredControllerTest {

	
	private ConstructorInjectedController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
		
	}
	
	@Test
	public void getGreeting() {
		System.out.println(controller.getGreeting());
	}
	
}
