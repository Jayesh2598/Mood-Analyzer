package com.capgemini.learningTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.learning.MoodAnalyser;

public class MoodAnalyserTest {
	
	@Test
	public void testingSadMood() {
		MoodAnalyser mood = new MoodAnalyser();
		String expectedMood= "Sad";
		String actualMood= mood.analyseMood("I am in sad mood.");
		assertEquals(expectedMood, actualMood);
	}
	
	@Test
	public void testingAnyMood() {
		MoodAnalyser mood = new MoodAnalyser();
		String expectedMood= "Happy";
		String actualMood= mood.analyseMood("I am in any mood.");
		assertEquals(expectedMood, actualMood);
	}
}
