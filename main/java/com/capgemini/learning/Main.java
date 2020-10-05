package com.capgemini.learning;

import java.util.Scanner;

public class Main {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to Mood Analyzer Program!\n");
		
		System.out.println("Enter the message:");
		String message= sc.nextLine();
		
		MoodAnalyser mood = new MoodAnalyser(message);
		System.out.println(mood.analyseMood());
	}

}
