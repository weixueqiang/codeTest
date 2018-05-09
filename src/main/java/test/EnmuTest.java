package test;

import java.util.concurrent.SynchronousQueue;

public class EnmuTest {

	public static void main(String[] args) {
		
		String appId= UserType.TEACHER.getAppId();
		String appSecret= UserType.TEACHER.getAppSecret();
		String title= UserType.TEACHER.getTitle();
		System.out.println(appId+"appId");
		System.out.println(appSecret+"appSecret");
		System.out.println(title);
		
		System.out.println(UserType.getType(appId));
	}
	
}
