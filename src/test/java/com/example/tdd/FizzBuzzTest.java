package com.example.tdd;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
    public void initializeGame() {
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertNotNull( fizzBuzz );
    }
	
	@Test
    public void numberEqualToOne() {
		FizzBuzz fizzBuzz=new FizzBuzz();
		int number = 1;
		String numberReturned = fizzBuzz.play(number);    
		Assert.assertEquals("1",numberReturned );
    }

}
