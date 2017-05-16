package com.xavient.task5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DOB {

	
	public void test(){
		String date = "05/26/2178";
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		try {
			Date res = dateFormat.parse(date);
			System.out.println(res);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2068, 04, 26);
		Date res = calendar.getTime();
		System.out.println(res);
	}
	public static void main(String[] args) {
		DOB dob = new DOB();
		dob.test();
	}
}
