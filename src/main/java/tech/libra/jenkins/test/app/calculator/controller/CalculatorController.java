package tech.libra.jenkins.test.app.calculator.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tech.libra.jenkins.test.calculator.Calculator;

@RestController
public class CalculatorController {
	@Resource private Calculator calculator;
	
	@RequestMapping("/add")
	public Integer add(@RequestParam("v1") Integer v1, @RequestParam("v2") Integer v2) {
		
		return calculator.add(v1, v2);
	}
}
