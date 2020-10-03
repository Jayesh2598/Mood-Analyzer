package com.capgemini.learningTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.learning.MoodAnalyser;

public class MoodAnalyserTest {
	
	@Test
	public void testingMood() {
		MoodAnalyser mood = new MoodAnalyser();
		String expectedMood= "Sad";
		String actualMood= mood.analyseMood("I am in sad mood.");
		assertEquals(expectedMood, actualMood);
	}
}
