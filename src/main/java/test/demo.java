package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class demo {

	public static void main(String[] args) {
		
		XMLWriter xw=null;
		try {
			FileOutputStream fos=new FileOutputStream("test.xml");
			OutputFormat of=new OutputFormat("test3.xml");
			xw=new XMLWriter(OutputFormat.createPrettyPrint());
			
			List<Point> list=new ArrayList<Point>();
			list.add(new Point(1,"kk",20));
			list.add(new Point(2,"ll",23));
			list.add(new Point(3,"jj",44));
			Document doc=DocumentHelper.createDocument();
			Element root= doc.addElement("list");
			for(Point p:list) {
				Element point=root.addElement("point");
				point.addAttribute("id", p.getId()+"");
				 point.addElement("name").addText(p.getName());
				 point.addElement("age").addText(p.getAge()+"");
			}
			
			xw.write(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(xw!=null) {
				try {
					xw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	

	
	
}
