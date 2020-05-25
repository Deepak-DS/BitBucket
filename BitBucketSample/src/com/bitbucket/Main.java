package com.bitbucket;

public class Main {
	public static void displayGreeting(){
		System.out.println("hello!, welcome to bitbucket");		
		System.out.println("Learning from youtube");
	}

	public static void main(String[] args) {
		displayGreeting();
		LearningData data =  new LearningData();
		data.display();
		

	}

}
