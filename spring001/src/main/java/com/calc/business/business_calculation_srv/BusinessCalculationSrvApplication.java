package com.calc.business.business_calculation_srv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BusinessCalculationSrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessCalculationSrvApplication.class, args);
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


		System.out.println(String.format("%n%n%nMax number: %d.%n",
										 context.getBean(BusinessCalculationService.class).findMax()));
	}

}
