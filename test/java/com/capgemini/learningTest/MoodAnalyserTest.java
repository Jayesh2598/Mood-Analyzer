package com.capgemini.learningTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.learning.MoodAnalyser;

public class MoodAnalyserTest {
	
	@Test
	public void testingSadMood() {
		MoodAnalyser mood = new MoodAnalyser("I am in sad mood.");
		String expectedMood= "Sad";
		String actualMood= mood.analyseMood();
		assertEquals(expectedMood, actualMood);
	}
	
	@Test
	public void testingAnyMood() {
		MoodAnalyser mood = new MoodAnalyser("I am in happy mood.");
		String expectedMood= "Happy";
		String actualMood= mood.analyseMood();
		assertEquals(expectedMood, actualMood);
	}
}
