package com.book.practice;

import com.book.practice.MainClass.NestedClass;

public class NestedClassExtension extends NestedClass {

    public NestedClassExtension(MainClass mainClass, String nestedValue) {
        mainClass.super(nestedValue);
    }
    public static void main(String[] args) {
		NestedClassExtension classExtension = new NestedClassExtension(new MainClass("mahima"), "Agrawal");
	}
}
//MainClass mc = new MainClass("main");
//mc.new NestedClass("nested");