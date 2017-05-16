package com.prac;

public class CountCharacterOccurence {
public static void main(String[] args) {
	String str = "Java is a java and java";
	//char c = 'a';
	int count =str.length() - str.replace("a", "").length();
	System.out.println("Number of occurances of 'a' in " + str + "=" + count);
}
}
