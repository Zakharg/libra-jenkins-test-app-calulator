package tech.libra.jenkins.test.app.calculator;

import tech.libra.jenkins.test.calculator.*;

public class App {
	public static void main(String [] args) {
		CalculatorImpl calculator = new CalculatorImpl();
		System.out.println(calculator.sub(10, 5));
		
	}
}
