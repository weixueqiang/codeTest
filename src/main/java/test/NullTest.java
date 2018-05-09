package test;

import java.util.concurrent.SynchronousQueue;

public class NullTest {

	public static void main(String[] args) {
		System.out.println((Boolean)null);
		if(((Boolean)null)) {
			System.out.println("haha");
		}
		
	}
	
}
