package test;

import java.io.File;
import java.io.IOException;

public class FilePathDemo {

	public static void main(String[] args) throws Exception {
		String path="D:"+File.separator+"b"+File.separator+"test1.txt";
		File file=new File(path);
		if(file.exists()) {
			System.out.println("文件已存在！");
		}else {
			file.createNewFile();
		}
		System.out.println("ok!");
		
	}
	
}
