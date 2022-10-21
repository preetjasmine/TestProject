package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {
	private Properties prop;
	public Properties readPropfile() throws IOException {
		prop= new Properties();
		
		FileInputStream file= new FileInputStream("C:\\Users\\14166\\Automation\\FinalProject\\src\\main\\java\\Utils\\config.properties");
		prop.load(file);

		return prop;
		
	}

}
