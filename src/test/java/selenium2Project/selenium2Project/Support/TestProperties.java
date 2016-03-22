package selenium2Project.selenium2Project.Support;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {

	public Properties prop = new Properties();
	InputStream input = null;
	
	public TestProperties(String testPropertiesFilename) {
		try {
			input = getClass().getClassLoader().getResourceAsStream(testPropertiesFilename);
			prop.load(input);
		} catch(IOException ex) {
			ex.printStackTrace();
		} finally {
			if(input != null) {
				try {
					input.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
