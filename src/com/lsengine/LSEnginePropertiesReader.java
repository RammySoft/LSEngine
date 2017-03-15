package com.lsengine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LSEnginePropertiesReader {

	private static LSEnginePropertiesReader lsEnginePropertiesReader;
	private Properties lsEngineProperties;

	public static LSEnginePropertiesReader getInstance() {
		if (lsEnginePropertiesReader == null) {
			lsEnginePropertiesReader = new LSEnginePropertiesReader();
		}
		return lsEnginePropertiesReader;

	}

	public void loadProperties(final String aPropertiesFilePath) {
		if (lsEngineProperties == null) {
			lsEngineProperties = new Properties();
		}

		try {
			lsEngineProperties.load(new FileInputStream(aPropertiesFilePath));

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public String getProperty(String aKey) {
		return lsEngineProperties.getProperty(aKey);
	}

	public int getInt(String aKey) {
		return Integer.parseInt(lsEngineProperties.getProperty(aKey));
	}

	public boolean getBoolean(String aKey) {
		return Boolean.parseBoolean(lsEngineProperties.getProperty(aKey));
	}

	public double getDouble(String aKey) {
		return Double.parseDouble(lsEngineProperties.getProperty(aKey));
	}

	public float getFloat(String aKey) {
		return Float.parseFloat(lsEngineProperties.getProperty(aKey));
	}
	
	public Properties getAllProperties()
	{
		return lsEngineProperties;
	}
}
