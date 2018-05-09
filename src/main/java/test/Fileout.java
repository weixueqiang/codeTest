package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileout {

	public static void main(String[] args) {
		
	File file=new File("test.txt");
	try {
		file.createNewFile();
	} catch (IOException e) {
		
		                e.printStackTrace();
	}
	
		
		
	}
                	
                	
}
