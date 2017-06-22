package com.book.practice;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		String[] sa = { ">ff<", "> f<", ">f <", ">FF<" }; // ordered?
		PriorityQueue<String> pq3 = new PriorityQueue<String>();
		for (String s : sa)
			pq3.offer(s);
		for (String s : sa)
			System.out.print(pq3.poll() + " ");
	}
}

//    > f< >FF< >f < >ff<