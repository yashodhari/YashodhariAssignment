package com.trello.qspiders.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This class facilitate file handling to feath the data from different files.
 * @author yashodhari
 *
 */

public class FileUtility {
	/**
	 * We can read the common data from the property file in the form of key and value
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String readDataFromPropertyFile(String key) throws IOException {
	
	FileInputStream fis=new FileInputStream("./src/test/Resources/trellodata.properties");
	
	Properties pobj=new Properties();
	pobj.load(fis);
	String value=pobj.getProperty(key);
	return value;
	}
}
