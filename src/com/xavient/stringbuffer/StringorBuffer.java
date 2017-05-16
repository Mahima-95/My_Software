package com.xavient.stringbuffer;

public class StringorBuffer {

	public void stringEquals(){
		String s="mahima";
		String s1="mahi";
		System.out.println(s.equals(s1));
	}
	public void stringBufferEquals(){
		String s="mahima";
		String s1="mahi";
		System.out.println(s.equals(s1));
	}
	
	public void hashcodeString(){
		String s ="java";
		String s1= s+"language";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}
	public void hashcodeStringBuffer(){
	StringBuffer stringBuffer = new StringBuffer("java");
	System.out.println(stringBuffer.hashCode());
	stringBuffer.append("language");
		System.out.println(stringBuffer.hashCode());
		stringBuffer.append("javapoint");
		System.out.println(stringBuffer.hashCode());
	}
	public static void main(String[] args) {
		StringorBuffer stringorBuffer = new StringorBuffer();
		stringorBuffer.stringEquals();
		stringorBuffer.stringBufferEquals();
		stringorBuffer.hashcodeString();
		stringorBuffer.hashcodeStringBuffer();
	}
}
