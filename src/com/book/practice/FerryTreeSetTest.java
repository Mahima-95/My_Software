package com.book.practice;

import java.util.*;

public class FerryTreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205); // add some departure times
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		// Java 5 version
		TreeSet<Integer> subset = new TreeSet<Integer>();
		subset = (TreeSet) times.headSet(1600);
		System.out.println("J5 - last before 4pm is: " + subset.last());
		TreeSet<Integer> sub2 = new TreeSet<Integer>();
		sub2 = (TreeSet) times.tailSet(2000);
		System.out.println("J5 - first after 8pm is: " + sub2.first());
		// Java 6 version using the new lower() and higher() methods
		System.out.println("J6 - last before 4pm is: " + times.lower(1600));
		System.out.println("J6 - first after 8pm is: " + times.higher(2000));
	}
}
/*NavigableSet methods related to this type of
navigation are  lower() ,  floor() ,  higher() ,  ceiling() , and the mostly parallel
NavigableMap methods are  lowerKey() ,  floorKey() ,  ceilingKey() , and
higherKey() . 
The difference between  lower() and  floor() is that  
lower() returns the element less than the given element, 
and  floor() returns the element less than or equal to the given element. 
Similarly,  higher() returns the element
greater than the given element, and  
ceiling() returns the element greater than or equal to the given element.*/