package CommonUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Prpertiy_File {
	public void getKey(String filepath, String key) {
	FileInputStream fis;
	try {
		fis=new FileInputStream(filepath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Properties property= new Properties();
	
	property.get(key);

}
}