package Propery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import generic_libraries.Auto_const;
import generic_libraries.Generic123;

public class Property1 implements Auto_const

{
	@Test
	public static void Property1(String path,String key) throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		
		
		p.load(new FileInputStream(path));
		String data=p.getProperty(key);
		System.out.println(data);
		
		
		
	}
	
	

}
