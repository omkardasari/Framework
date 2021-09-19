package resorces.Commerce;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./prop/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage()); //if file not found it will throw exception
		}
	}
	
	
	public String getApplicationURL()
	{
	String url=pro.getProperty("baseURL");
	return url;
	}
	public String password()
	{
	String passkey=pro.getProperty("pass");
	return passkey;
	}
	public String frstname()
	{
	String keyname=pro.getProperty("fname");
	return keyname;
	}
	public String lastname()
	{
	String keylname=pro.getProperty("lname");
	return keylname;
	}
	public String dob()
	{
	String keydob=pro.getProperty("date");
	return keydob;
	}
	public String cname()
	{
	String keycname=pro.getProperty("company");
	return keycname;
	}
	public String cmnt()
	{
	String keycomment=pro.getProperty("comment");
	return keycomment;
	}
	
}
