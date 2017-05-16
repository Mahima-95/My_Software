import food.fruit;


public class Apple extends fruit{
	Apple(){
		System.out.println("Apple");
	}
	
public static void main(String[] args) {
	Apple app = new Apple();
	app.a();
}

@Override
public void a() {
	System.out.println("Interface method");
	
}
}
