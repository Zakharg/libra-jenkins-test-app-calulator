package tech.libra.jenkins.test.app.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tech.libra.jenkins.test.calculator.Calculator;
import tech.libra.jenkins.test.calculator.CalculatorImpl;

@SpringBootApplication
public class App {
	
	public static void main(String [] args) {
		SpringApplication.run(App.class, args);		
	}
	
	@Bean 
	public Calculator getCalculator() {
		return new CalculatorImpl();
	}
}
