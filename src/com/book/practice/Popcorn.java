package com.book.practice;

class Popcorn {
	public void pop() {
		System.out.println("popcorn");
	}
}

class Food {
	Popcorn p = new Popcorn() {
		public void pop() {
			System.out.println("anonymous popcorn");
		}
		
		public void sizzle() {
			System.out.println("anonymous sizzling popcorn");
			}
	};
	
	void test(){
		p.pop();
	}
}
