package APIautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadInput {

	public static String getUrl() throws IOException {
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream("./src/test/java/APIautomation/Baseurl.properties");
			prop.load(file);
			String url = prop.getProperty("baseurl");
			return url;			
	}
}
