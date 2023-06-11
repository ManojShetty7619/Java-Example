package com.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	public static void main(String[] args) throws ParseException {
		String times = null;
		
		Date time = new SimpleDateFormat("hh:mm a").parse("10:30 AM");
		System.out.println(time);
		
		times = new SimpleDateFormat("HH:mm").format(time);
		System.out.println(times);
	}

}
