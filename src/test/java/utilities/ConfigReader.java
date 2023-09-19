package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
public static Properties intializeProperties() 
{
	Properties properties=new Properties();
	File propFile=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
	FileInputStream fileInputStream;
	try {
		fileInputStream = new FileInputStream(propFile);
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	return properties;
	
}
}
