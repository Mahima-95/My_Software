package com.xavient.printfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintFile {

	private static final String FILENAME = "D:\\Mahima\\Mahima docs\\java core.txt";

	public static void main(String[] args) {

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILENAME))){
			String sCurrentLine;
			while ((sCurrentLine = bufferedReader.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
