package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WangDi {

	public static void main(String[] args) {
		int n=5;
		List<Point1> c=new ArrayList<>();
		test(1,n, c, 1);
		
		c.sort(new Comparator<Point1>() {
			@Override
			public int compare(Point1 a, Point1 b) {
				 return a.getX()+a.getY()*100-b.getX()-b.getY()*100;
			}
		});
		
		for(int i=0;i<c.size();i++) {
			System.out.print(c.get(i).getValue()+(i%n==(n-1) ? "\n":"\t" ));
		}
	}
	
	private  static void test(int num,int b,List<Point1> c,int min) {
		int end=b;
		int start=min;
		while(start<end) {
			c.add(new Point1(b,start++,num++));
		}
		end=b;
		start=min;
		while(end>min) {
			c.add(new Point1(end--,b,num++));
		}
		end=b;
		start=min;
		while(end>min) {
			c.add(new Point1(min,end--,num++));
		}
		end=b;
		start=min;
		while(start<end) {
			c.add(new Point1(start++,min,num++));
		}
		b--;
		min++;
		if(b==min) {
			c.add(new Point1(b,min,num));
		}else if(b>min){
			test(num,b, c, min);
		}
		
	}
	
}

class Point1{
	
	private int x;
	private int y;
	private int value;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Point1 [x=" + x + ", y=" + y + ", value=" + value + "]";
	}
	public Point1(int x, int y, int value) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;
	}
	
	
	
}