/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.seamoo.utils.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Administrator
 */
public class Converter {

	public static String toString(Date d, String format) {
		DateFormat df = new SimpleDateFormat(format);
		return df.format(d);
	}

	public static Date toDate(String s, String format) throws ParseException {
		DateFormat df = new SimpleDateFormat(format);
		return df.parse(s);
	}

	public static Date toDate(java.sql.Date d) {
		return new Date(d.getTime());
	}

	public static java.sql.Date toSqlDate(String s, String format)
			throws ParseException {
		return toSqlDate(toDate(s, format));
	}

	public static java.sql.Date toSqlDate(Date d) {
		return new java.sql.Date(d.getTime());
	}

	public static int toInt(String s) {
		return Integer.parseInt(s);
	}

	public static int toInt(Object o) {
		return toInt(o.toString());
	}

	public static long toLong(String s) {
		return Long.parseLong(s);
	}

	public static long toLong(double d) {
		return Math.round(d);
	}

	public static double toDouble(String s) {
		return Double.parseDouble(s);
	}

	public static double toDouble(Object o) {
		return toDouble(o.toString());
	}

	public static boolean toBoolean(String s) {
		return Boolean.parseBoolean(s);
	}

	public static String toString(boolean b) {
		// TODO Auto-generated method stub
		return Boolean.toString(b);
	}
}
