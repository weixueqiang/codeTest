package test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
	
	public static void main(String[] args) {
		RandomAccessFile raf=null;
		try {
			raf=new RandomAccessFile("test.txt", "rw");
			String str="你人在那里！";
			/*raf.writeInt(1234);*/
			raf.write(str.getBytes("UTF-8"));
			System.out.println("ok");
			byte[] data=new byte[1024*10];
			int len=0;
			while((len=raf.read(data))!=-1) {
				String s=new String(data,0,len,"utf-8");
				System.out.println(s);
			}
			
		} catch (Exception e) {
			   e.printStackTrace();
		}finally {
			if(raf!=null) {
				try {
					raf.close();
				} catch (IOException e) {
					   e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
}
