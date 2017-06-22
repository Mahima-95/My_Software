package com.book.practice;

class MyWonderfulClass {
	void go() {
Bar b = new Bar();
b.doStuff(new Foo() {
	
	@Override
	public void foof() {
		System.out.println("foofy");
		
	}
	public void foof1() {
		System.out.println("foofy");
		
	}
}); // Don't try to compile this at home
}
}

interface Foo {
	void foof();
}

class Bar extends MyWonderfulClass implements Foo{
	void doStuff(Foo f) {
	}

	@Override
	public void foof() {
		// TODO Auto-generated method stub
		
	}
}

/*All the action starts on line 4. We're calling  doStuff() on a  Bar object, but
the method takes an instance that IS-A  Foo , where  Foo is an interface. So we must
make both an implementation class and an instance of that class, all right here in the
argument to  doStuff() . So that's what we do. We write
new Foo() {
to start the new class definition for the anonymous class that implements the  Foo
interface.  Foo has a single method to implement,  foof() , so on lines 5, 6, and 7
we implement the  foof() method. Then on line 8—whoa!—more strange syntax
appears. The first curly brace closes off the new anonymous class definition. But
don't forget that this all happened as part of a method argument, so the close
parenthesis, ), finishes off the method invocation, and then we must still end the
statement that began on line 4, so we end with a semicolon. Study this syntax! You
will see anonymous inner classes on the exam, and you'll have to be very, very picky
about the way they're closed. If they're argument local, they end like this:
});
but if they're just plain-old anonymous classes, then they end like this:
};
Regardless, the syntax is not what you use in virtually any other part of Java, so
be careful. Any question from any part of the exam might involve anonymous inner
classes as part of the code.*/



