package com.testtt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SampleLogin {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(
				new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\CucumberRamkumar\\Config\\config.properties"));
		;
		Object object = properties.get("url");
		String value = (String) object;
		System.out.println(value);
	}
}
