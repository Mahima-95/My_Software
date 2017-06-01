package com.prac;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountFromFile {

	public static void test() throws IOException {
		String content = new String(Files.readAllBytes(Paths
				.get("D:/Mahima/Mahima docs/task.txt")));
		
		System.out.println(content);
		
		List<String> wL = new ArrayList<String>(Arrays.asList(content
				.split("\\s+")));
		
		Map<String, Integer> counts = wL.parallelStream().collect(
				Collectors.toMap(w -> w, w -> 1, Integer::sum));
		
		System.out.println(counts);

	}

	public static void main(String[] args) throws IOException {
		WordCountFromFile.test();
	}
}
