package com.example;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class GreetingTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void TestGreeting() {
        Greeting.sayHi();
        assertEquals("Hi!\n", outContent.toString());
    }  
}
