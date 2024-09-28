package com.geeks.array;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
public static void main(String[] args) {
  System.out.println(getBackDateFromCurrentDate(-7,"MMddyyyy"));
}
public static String getBackDateFromCurrentDate(int days, String format) {
  Calendar cal = Calendar.getInstance();
  cal.add(Calendar.DATE, days);
  DateFormat dateFormat = new SimpleDateFormat(format);
  return dateFormat.format(cal.getTime());
}
}
