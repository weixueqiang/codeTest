package test;

import java.util.Map;

public class SQLSubDemo {

	public void test() {
		String hql="select distinct id from user where id=1 order by id";
		String tmp = hql.toUpperCase();
		final StringBuilder sb = new StringBuilder(hql);
//		final Map<String, Object> a = args;
		System.out.println("1-->>:"+hql);
		int from = tmp.indexOf("FROM");
		int to = tmp.lastIndexOf("ORDER BY");
		sb.delete(0, from);
		System.out.println("2-->>:"+sb.toString());
		if (to != -1) {
			sb.delete(to - from, sb.length());
		}
		System.out.println("3-->>:"+sb.toString());

		// 搜索中有distance关键字
		if (tmp.indexOf("DISTINCT") != -1) {
			sb.insert(0, "Select count(" + hql.substring(tmp.indexOf("DISTINCT"), from) + ") ");
		} else {
			sb.insert(0, "Select count(*) ");
		}
		System.out.println("4-->>:"+sb.toString());
	}
	
	public static void main(String[] args) {
		SQLSubDemo ssd=new SQLSubDemo();
		ssd.test();
		
		
		
	}
	
}
