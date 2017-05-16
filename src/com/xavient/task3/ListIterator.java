package com.xavient.task3;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {
	public static void main(String a[]){
     List<Integer> list = new ArrayList<Integer>();
     list.add(23);
     list.add(5);
     list.add(26);
     java.util.ListIterator<Integer> litr= list.listIterator();
     System.out.println("Elements in forward directiton");
     while(litr.hasNext())
    	 System.out.println(litr.next());
     System.out.println("Elements in backward directiton");
    while(litr.hasPrevious())
    	System.out.println(litr.previous());
	}
}
