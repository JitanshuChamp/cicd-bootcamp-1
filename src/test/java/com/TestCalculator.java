package com;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculator {
	
	CalculatorService calculatorService = new CalculatorService();
	
	@Test
	public void testSum() {
		
		Assertions.assertEquals(20, calculatorService.sum());
	}
	
	@Test
	public void testMultiply() {
		
		Assertions.assertEquals(100,calculatorService.multiply());
	}
	
	@Test
	public void testSubtraction() {
		Assertions.assertEquals(0, calculatorService.subtraction());
	}
	
	@Test
	public void testDivision() {
		Assertions.assertEquals(1, calculatorService.division());
	}
	@Test
	public void testConcatination() {
		Assertions.assertEquals("JitanshuChamp", calculatorService.concat());
	}
	
	@Test
	public void testSquare() {
		Assertions.assertEquals(400, calculatorService.square());
	}
	
	@Test
	public void testRound() {
		Assertions.assertEquals(70, calculatorService.round());
	}
	
	@Test
	public void testBool() {
		Assertions.assertEquals(true, calculatorService.bool());
	}
	
	@Test
	public void testPercentage() {
		Assertions.assertEquals(500, calculatorService.percentage());
	}
	
	@Test
	public void testSquareRoot() {
		Assertions.assertEquals(20, calculatorService.squareRoot());
	}
	
	

}
