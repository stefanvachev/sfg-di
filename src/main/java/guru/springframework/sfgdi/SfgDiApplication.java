package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) applicationContext.getBean("myController");

		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("------- Primary");
		String greeting = myController.sayHello();
		System.out.println(greeting);


		System.out.println("-------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getString());

		System.out.println("------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getString());

		System.out.println("------- Constructon");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getString());

	}

}
