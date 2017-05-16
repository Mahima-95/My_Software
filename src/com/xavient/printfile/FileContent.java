package com.xavient.printfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContent {

	public static String FILENAME = "D:\\Mahima\\Mahima docs\\java core.txt";

	public static void main(String[] args) {

		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		try {
			String data;
			bufferedReader = new BufferedReader(new FileReader(FILENAME));

			while ((data = bufferedReader.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();

				if (fileReader != null)
					fileReader.close();
			} catch (IOException exception1) {
				exception1.printStackTrace();
			}
		}
	}
}
