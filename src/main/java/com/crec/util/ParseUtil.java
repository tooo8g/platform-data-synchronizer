package com.crec.util;

public class ParseUtil {

	public static double parseDouble(String s) {
		if (s != null && !s.equals(""))
			return Double.parseDouble(s);
		return 0.0;
	}

	public static int parseInt(String s) {
		if (s != null && !s.equals(""))
			return Integer.parseInt(s);
		return 0;
	}
}
