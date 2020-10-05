package com.capgemini.learning;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public MoodAnalyser() {
		super();
	}
	
	public String analyseMood() {
		if(message.toLowerCase().contains(" sad"))
			return "Sad";
		else
			return "Happy";
	}
}
