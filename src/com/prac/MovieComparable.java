package com.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MovieComparable implements Comparable<MovieComparable> {
	private double rating;
	private String name;
	private int year;

	@Override
	public int compareTo(MovieComparable o) {
		
		return this.year - o.year;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public MovieComparable(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	public static Comparator<MovieComparable> comparator = new Comparator<MovieComparable>() {

		@Override
		public int compare(MovieComparable o1, MovieComparable o2) {
			String MovieName = o1.getName();
			String MovieName1 = o1.getName();
			return MovieName.compareTo(MovieName1);
		}
		
	};
	public static void main(String[] args) {
		ArrayList<MovieComparable> list = new ArrayList<MovieComparable>();
		list.add(new MovieComparable(8.4, "Return of the Jedi", 1983));
		list.add(new MovieComparable(8.7, "Star Wars", 1977));
		list.add(new MovieComparable(8.8, "Empire Strikes Back", 1980));
		Collections.sort(list);
		System.out.println("Movies after sorting : ");
		for (MovieComparable comparable : list) {
			System.out.println(comparable.getName() + " " + comparable.getRating() + " "
					+ comparable.getYear());
		}
		
		Arrays.sort( MovieComparable.comparator);

	}
}
