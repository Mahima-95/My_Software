package com.xavient.stringbuffer;

public class AppendString {

	public void tAppend(){
		System.out.println("*****Append Example*****");
		StringBuffer stringBuffer = new StringBuffer("Mahima ");
		stringBuffer.append("Agrawal");
		System.out.println(stringBuffer);
	}
	public void tInsert(){
		System.out.println("*****Insert Example*****");
		StringBuffer stringBuffer = new StringBuffer("Mahima ");
		System.out.println(stringBuffer.insert(6, " agg"));
	}
	public void tReplace(){
		System.out.println("*****Replace Example*****");
		StringBuffer stringBuffer = new StringBuffer("Hello");
		System.out.println(stringBuffer.replace(1, 3, "java")); 
	}
	public void tDelete(){
		System.out.println("*****Delete Example*****");
		StringBuffer stringBuffer = new StringBuffer("Hello");
		System.out.println(stringBuffer.delete(4, 5));  
	}
	public void tReverse(){
		System.out.println("*****Reverse Example*****");
		StringBuffer stringBuffer = new StringBuffer("mahima");
		System.out.println(stringBuffer.reverse());  
	}
	public void tCapacity(){
		System.out.println("*****Capacity Example*****");
		StringBuffer stringBuffer = new StringBuffer();
		System.out.println(stringBuffer.capacity());
		stringBuffer.append("Mahima");
		System.out.println(stringBuffer.capacity());  
		stringBuffer.append("java is my favourite language");
		System.out.println(stringBuffer.capacity());
	}
	public void tChatAt(){
		System.out.println("*****ChatAt Example*****");
		StringBuffer stringBuffer = new StringBuffer("Mahima");
		System.out.println(stringBuffer.charAt(0));
		System.out.println("length=" +stringBuffer.length());
	}
	public void tSubstring(){
		System.out.println("*****Substring Example*****");
		StringBuffer stringBuffer = new StringBuffer("Mahima");
		System.out.println(stringBuffer.substring(0,4));
		System.out.println(stringBuffer.substring(2));
	}
	public static void main(String[] args) {
		AppendString appendString = new AppendString();
		appendString.tAppend();
		appendString.tInsert();
		appendString.tReplace();
		appendString.tDelete();
		appendString.tReverse();
		appendString.tCapacity();
		appendString.tChatAt();
		appendString.tSubstring();
	}
}
