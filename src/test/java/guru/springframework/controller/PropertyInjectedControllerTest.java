package guru.springframework.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.services.ConstructorGreetingService;

public class PropertyInjectedControllerTest {

	
	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new ConstructorGreetingService();
	}
	
	
	@Test
	void greeting() {
		System.out.println(controller.getGreeting());
	}
	
}
