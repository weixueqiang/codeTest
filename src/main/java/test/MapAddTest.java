package test;

import java.util.HashMap;
import java.util.Map;

public class MapAddTest {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "one");
		System.out.println(map);
		map.put("1", "一");
		System.out.println(map);
	}
	
	
}
