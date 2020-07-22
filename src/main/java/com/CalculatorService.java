package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	@GetMapping("/sum")
	public int sum() {
		return 10+10;
	}
	
	@GetMapping("/multiply")
	public int multiply() {
		return 10*10;
	}
	
	@GetMapping("/subtraction")
	public int subtraction() {
		return 10-10;
	}
	
	@GetMapping("/division")
	public int division() {
		return 10/10;
	}
	
	@GetMapping("/concatinate")
	public String concat() {
		String val1,val2,conct;
		val1="Jitanshu";
		val2="Champ";
		return conct = val1 + val2;
	}
	
	@GetMapping("/bool")
	public boolean bool() {
		return true;
	}
	
	@GetMapping("/percentage")
	public int percentage() {
		return 500*100/100;
	}
	
	@GetMapping("/squareRoot")
	public double squareRoot() {
		double a=400;
		return Math.sqrt(a);
	}
	
	@GetMapping("/square")
	public int square() {
		int a=20;
		return a*a;
	}
	
	@GetMapping("/round")
	public double round() {
		double a=69.87;
		return Math.round(a);
	}
}
