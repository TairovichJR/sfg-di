package guru.springframework.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.controllers.ConstructorInjectredController;
import guru.springframework.services.ConstructorGreetingService;

public class ConstructorInjectredControllerTest {

	
	private ConstructorInjectredController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new ConstructorInjectredController(new ConstructorGreetingService());
		
	}
	
	@Test
	public void getGreeting() {
		System.out.println(controller.getGreeting());
	}
	
}
