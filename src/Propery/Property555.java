package Propery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property555 {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./p.properties"));
		String data=p.getProperty("city");
		System.out.println(data);
	}

}
