package org.book_recommend.config1;
import java.sql.*;
import java.util.Properties;
import java.io.*;
public class DBConfig 
{
	protected static Connection conn;
	protected static PreparedStatement stmt;
	protected static ResultSet rs;
	
    static{
		try 
		{
			File f=new File("");
		
			String path=f.getAbsolutePath()+"\\src\\main\\resources\\db.properties";
			//System.out.println(path);
		   Properties p=new Properties();
		   p.load(new FileInputStream(path));
		   Class.forName(p.getProperty("driver"));
		   conn=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
		   if(conn!=null)
		   {
			   System.out.println("Database is connected");
		   }
		   else
		   {
			   System.out.println("Database is not  connected");
		   }
		   System.out.println("Properties files read successfully....");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
    }
    public static void main(String x[])
    {
    	
    }
}
