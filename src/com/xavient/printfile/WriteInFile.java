package com.xavient.printfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteInFile {

	public static final String FILENAME = "D:\\Mahima\\Mahima docs\\java core.txt";
	static Scanner scanner;

	public static void main(String[] args) {

		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;
		BufferedWriter writer = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter editing data in this file");
			String data = scanner.nextLine();
			System.out.println(data);
			fileWriter = new FileWriter(FILENAME);
			writer = new BufferedWriter(fileWriter);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(data);
			writer.write(data);
			System.out.println("Done");

		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
