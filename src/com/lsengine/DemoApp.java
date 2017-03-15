package com.lsengine;


public class DemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LSEnginePropertiesReader lseProps = LSEnginePropertiesReader.getInstance();
		lseProps.loadProperties("C:/Users/USER/Desktop/raja.txt");
		System.out.println(lseProps.getAllProperties().toString());
		LSEnginePropertiesReader lseProps2 = LSEnginePropertiesReader.getInstance();
		lseProps2.loadProperties("C:/Users/USER/Desktop/test.properties");
		System.out.println(lseProps2.getAllProperties().toString());
		LSEnginePropertiesReader lseProps3 = LSEnginePropertiesReader.getInstance();
		lseProps2.loadProperties("D:/VRBWS/batch300117/eclipseWS/LSEngine/resources/LSEngine.properties");
		System.out.println(lseProps3.getAllProperties().toString());
	}

}
