package com.book.practice;

public class Foody {

	Cookable cookable = new Cookable() {
		
		@Override
		public void cook() {
			System.out.println("anonymous cookable implementer");
			
		}
	};
}

/*Argument-Defi ned Anonymous Inner Classes
If you understood what we've covered so far in this chapter, then this last part will
be simple. If you are still a little fuzzy on anonymous classes, however, then you
should reread the previous sections. If they're not completely clear, we'd like to take
full responsibility for the confusion. But we'll be happy to share.*/