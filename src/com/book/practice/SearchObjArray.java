package com.book.practice;

import java.util.*;

class SearchObjArray {
	public static void main(String[] args) {
		String[] sa = { "one", "two", "three", "four" };
		Arrays.sort(sa); // #1
		for (String s : sa)
			System.out.print(s + " ");
		System.out.println("\none = " + Arrays.binarySearch(sa, "one")); // #2
		System.out.println("now reverse sort");
		ReSortComparator rs = new ReSortComparator(); // #3
		Arrays.sort(sa, rs);
		for (String s : sa)
			System.out.print(s + " ");
		System.out.println("\none = " + Arrays.binarySearch(sa, "one")); // #4
		System.out.println("one = " + Arrays.binarySearch(sa, "one", rs)); // #5
	}

	static class ReSortComparator implements Comparator<String> { // #6
		public int compare(String a, String b) {
			return b.compareTo(a); // #7
		}
	}
}
/*Here's what happened:
Line 1 Sort the  sa array, alphabetically (the natural order).
Line 2 Search for the location of element "one", which is 1.
Line 3 Make a Comparator instance. On the next line we re-sort the array using
the Comparator.
Line 4 Attempt to search the array. We didn't pass the  binarySearch()
method the Comparator we used to sort the array, so we got an incorrect
(undefined) answer.
Line 5 Search again, passing the Comparator to  binarySearch() . This time
we get the correct answer, 2
Line 6 We define the Comparator; it's okay for this to be an inner class.
Line 7 By switching the use of the arguments in the invocation of
compareTo() , we get an inverted sort.*/