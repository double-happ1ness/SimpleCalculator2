package simpleCalc;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SimpleCalculatorTest {

	@Test
	void testSumOfTwoPositiveIntegers() {
		//Test Input
		int a = 3;
		int b = 2;
		//Test output
		int expectedOutput = 5 ;
		//Unit under test
		SimpleCalculator sc = new SimpleCalculator();
		//actual output / test output
		int actualOutput = sc.sum(a, b);
		//Comparison to Specification
		Assert.assertEquals(expectedOutput, actualOutput);
		
	}
	
	@Test
	void testMultiplyPositiveAndNegativeIntegers() {
		//Test Input
		int a = 7;
		int b = -2;
		//Test output
		int expectedOutput = -14;
		//Unit under test
		SimpleCalculator sc = new SimpleCalculator();
		//actual output / test output
		int actualOutput = sc.multiply(a, b);
		//Comparison to Specification		
		Assert.assertEquals(expectedOutput, actualOutput);
		
	}
	
	@Test
	public void testDivisionbyZero(){
        SimpleCalculator sc = new SimpleCalculator();        
        Assertions.assertThrows(ArithmeticException.class, () ->  sc.divide(9, 0));
	}
	
}
