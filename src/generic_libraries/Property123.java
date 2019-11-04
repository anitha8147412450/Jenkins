package generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property123 
{
	public static String Property12(String path,String key) throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		String data=p.getProperty(key);
		System.out.println(data);
		return data;
		
	}

}
