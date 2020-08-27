package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.ConstructorInjectredController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		
		
		MyController myController = (MyController) context.getBean("myController");
		
		System.out.println("------------Primary Bean based ------------------");
		
		System.out.println(myController.sayHello());
		
		System.out.println("------------Property based Controller ------------------");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)context.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("------------Setter based Controller ------------------");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController)context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		
		System.out.println("------------Constructor based Controller ------------------");
		
		
		ConstructorInjectredController constructorInjectredController = (ConstructorInjectredController)context.getBean("constructorInjectredController");
		
		System.out.println(constructorInjectredController.getGreeting());
		
		
		
	}

}
