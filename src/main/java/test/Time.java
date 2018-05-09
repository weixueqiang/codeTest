package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static void main(String[] args) throws Exception {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=sdf.format(date);
		System.out.println(str);
		Date dd= sdf.parse(str);
		System.out.println(dd);
	}
}
