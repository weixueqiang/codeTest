package test;

import java.util.Timer;
import java.util.TimerTask;

public class Demo1 {

	static {
		System.out.println("ok!");
		Timer timer=new Timer();
		int intervel=10;
		timer.schedule(new TimerTask() {
			public void run() {
				
			}
		},intervel,intervel);
	}
	
	
}
