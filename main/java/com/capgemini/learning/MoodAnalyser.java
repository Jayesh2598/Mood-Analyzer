package com.capgemini.learning;

import com.capgemini.learning.MoodAnalysisException.MoodAnalysisError;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public MoodAnalyser() {
	}
	
	public String analyseMood() throws MoodAnalysisException {
			if(message==null) {
				throw new MoodAnalysisException("Null message entered.", MoodAnalysisError.NULL);
			}
			if(message.equals("")) {
				throw new MoodAnalysisException("Empty message entered.", MoodAnalysisError.EMPTY);
			}		
			if (message.toLowerCase().contains(" sad"))
				return "Sad";
			else 
				return "Happy";
	}
}
