package com.ds.Ankit_Pathak;

public class TimeConversion_HackerRank {

	public static String timeConversion(String s) {
		// Write your code here

		if (s.contains("AM") && s.substring(0, 2).equals("12")) {
			String ss = "00";
			s = ss + s.substring(2, s.length());

		}
		if (s.contains("PM") && !s.substring(0, 2).equals("12")) {
			String ss = Integer.toString(Integer.parseInt(s.substring(0, 2)) + 12);
			s = ss + s.substring(2, s.length());

		}

		return s.substring(0, s.length() - 2);
	}
}
