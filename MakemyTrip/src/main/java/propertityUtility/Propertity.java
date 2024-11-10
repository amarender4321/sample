package propertityUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import commonutiltiy.FilePathUtil;
public class Propertity {
public String getvalues(String key) throws IOException {
FileInputStream file = new FileInputStream(FilePathUtil.COMMONFILEPATH);

Properties p = new Properties();
p.load(file);
String value =p.getProperty(key);
return value;
}
}