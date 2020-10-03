package com.capgemini.learning;

public class MoodAnalyser {
	
	public String analyseMood(String message) {
		if(message.toLowerCase().contains(" sad"))
			return "Sad";
		else
			return "Happy";
	}
}
