package guru.springframework.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.controllers.SetterInjectedController;
import guru.springframework.services.ConstructorGreetingService;

public class SetterInjectedControllerTest {

	
	SetterInjectedController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
		
	}
	
	
	@Test
	public void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
