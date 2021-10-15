package com.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	private Properties prop;
	
	public Properties init_prop() {
		
		prop = new Properties();
		try {
			FileInputStream fip = new FileInputStream("./src/test/resource/Configurations/config.properties");
			prop.load(fip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
}
