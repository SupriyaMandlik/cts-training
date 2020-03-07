package com.cts.training.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator;
	
	
	  @BeforeClass
      public static void init() {
    	  calculator =new Calculator();
    	  System.out.println("object created!!");
      }
	  
      @AfterClass
      public static void destroy() {
    	  calculator=null;
    	  System.out.println("object destroyed!!");
      }
  	@Ignore    
	@Test
	public void test_add_success() {
		assertEquals(17,calculator.add(12,5));
		 System.out.println("Inside add test");
	}
	@Ignore
   @Test
	public void test_sub_success() {
		assertEquals(7,calculator.sub(5, 12));
		 System.out.println("Inside sub test");
	}
	@Ignore
	@Test
	public void test_mul_success() {
		assertEquals(27,calculator.mul(9, 3));
		 System.out.println("Inside mul test");
	}
	@Ignore
	@Test
	public void test_div_success() {
		assertEquals(2,calculator.div(4, 2));
		 System.out.println("Inside div test");
}
	@Test
	public void test_to_check_prime_number_success() {
		assertEquals(true,calculator.isPrime(5));
		
	}
	
	@Test
	public void test_to_check_prime_number_fail() {
		assertEquals(false,calculator.isPrime(4));
		
	}
}


