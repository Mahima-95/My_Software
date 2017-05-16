package com.mahi.arraysofobjectreferences;

public class TestCustomException {
	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("welcome to vote");
	}

	static void switchExample() {
		String x = "hi";
		switch (x) {
		case "Hello":
			System.out.println("x equlas to 1");
			break;
		default:
			System.out.println("default");
		case "h":
			System.out.println("x equlas to 2");
			break;
		case "hhh":
			System.out.println("x equlas to 5");
			break;
		}
	}

	public static void main(String[] args) {
		try {
			// validate(13);
			switchExample();
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
			// throw m;
		}

		System.out.println("rest of the code...");
	}
}
