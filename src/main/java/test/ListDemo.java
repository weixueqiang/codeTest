package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list=list.subList(-1, 4);
		System.out.println(list);
		
	}
	
}
