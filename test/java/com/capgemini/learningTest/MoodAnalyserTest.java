package com.capgemini.learningTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.learning.MoodAnalyser;
import com.capgemini.learning.MoodAnalysisException;

public class MoodAnalyserTest {

	@Test
	public void testingSadMood() throws MoodAnalysisException {
		MoodAnalyser mood = new MoodAnalyser("I am in sad mood.");
		String expectedMood = "Sad";
		String actualMood = mood.analyseMood();
		assertEquals(expectedMood, actualMood);
	}

	@Test
	public void testingAnyMood() throws MoodAnalysisException {
		MoodAnalyser mood = new MoodAnalyser("I am in happy mood.");
		String expectedMood = "Happy";
		String actualMood = mood.analyseMood();
		assertEquals(expectedMood, actualMood);
	}
  
	@Test
	public void testingNullMood() throws MoodAnalysisException {
		MoodAnalyser mood = new MoodAnalyser();
		String expectedMood = "Happy";
		String actualMood;
		try {
			actualMood = mood.analyseMood();
		} catch (MoodAnalysisException e) {
			actualMood="Happy";
		}
		assertEquals(expectedMood, actualMood);
	}
}
