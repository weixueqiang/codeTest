package test;

import java.util.concurrent.SynchronousQueue;

public enum NumTestEnum {
	 
	ONE(3,"1"),
	TWO(4,"2");
	
	private String desc;
	
	private NumTestEnum(int index,String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public static void main(String[] args) {
//		NumTestEnum[] arr=NumTestEnum.values();
//		for(NumTestEnum n:arr) {
//			System.out.println(n.name()+":"+n.getDesc());
//		}
//		String one="ONE";
//		String s=NumTestEnum.valueOf(one).getDesc();
//		System.out.println(s);
		
		NumTestEnum.valueOf(null);
		
	}
	
	
}
