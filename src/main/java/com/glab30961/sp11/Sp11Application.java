package com.glab30961.sp11;

import com.glab30961.sp11.myServices.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages =  {"com.glab30961.sp11.myServices"})
public class Sp11Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Sp11Application.class, args);

		// get the bean from spring container
		Coach theCoach = context.getBean(Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();


	}
}
