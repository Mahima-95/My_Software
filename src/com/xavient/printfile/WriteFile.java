package com.xavient.printfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
	private static final String FILENAME = "D:\\Mahima\\Mahima docs\\java core.txt";
	static Scanner scanner;

	public static void main(String[] args) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
			scanner = new Scanner(System.in);
			System.out.println("Enter editing data in this file");
			String data = scanner.nextLine();
			bw.write(data);
			System.out.println(data);
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
