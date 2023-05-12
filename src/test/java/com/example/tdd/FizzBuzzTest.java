package com.example.tdd;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private  FizzBuzz fizzBuz;
	
	@Before
    public void initializeGame() {
		fizzBuz = new FizzBuzz();
		assertNotNull(fizzBuz);         
    }
	
	@Test
    public void numberEqualToOne() {
		int number = 1;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("1",numberReturned );
    }
	
	@Test
    public void numberEqualToTwo() {
		int number = 2;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("2",numberReturned );
    }

	@Test
    public void numberEqualToThree() {
		int number = 3;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("Fizz",numberReturned );
    }
	
	@Test
    public void numberEqualToFour() {
		int number = 4;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("4",numberReturned );
    }
	
	@Test
    public void numberEqualToFive() {
		int number = 5;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("Buzz",numberReturned );
    }
	
	@Test
    public void numberEqualToSix() {
		int number = 6;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("Fizz",numberReturned );
    }
	
	@Test
    public void numberEqualToSeven() {
		int number = 7;
		String numberReturned = fizzBuz.play(number);    
		Assert.assertEquals("7",numberReturned );
    }
}

