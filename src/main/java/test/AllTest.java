package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class AllTest {
	
	
	public static void main(String[] args) throws Exception {
		Map<String,String> map=new HashMap<>();
		map.put("1", "1");
		System.out.println(map);
		Map<String,String> map2=map;
		map2.put("2", "2");
		System.out.println(map);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/d");
//		Date date = new Date();
//		System.out.println(sdf.format(date));
		/*ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		ArrayList<Integer> lists=list;
		int remove = list.remove(1);
		System.out.println(lists);*/
	}

}

class test extends Thread{
	Date date=new Date();
	Calendar cal = Calendar.getInstance();
	
	@Override
	public void run() {
		cal.setTime(date);
		for(int i=0;i<1000;i++) {
			cal.add(Calendar.DAY_OF_YEAR, 1);
//			System.out.println(cal.getTime()+"   1");
		}
	}
}
class test1 extends Thread{
	Date date=new Date();
	Calendar cal = Calendar.getInstance();
	
	@Override
	public void run() {
		cal.setTime(date);
		for(int i=0;i<1000;i++) {
			date=cal.getTime();
			System.out.println(date);
		}
	}
}