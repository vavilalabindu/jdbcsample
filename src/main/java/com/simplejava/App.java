package com.simplejava;
import java.sql.*;//importing package to run sql queries

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception 
    {
      //load and register drivers
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	//Url to db,username and password
    	String url="jdbc:mysql://localhost:3306/oneplus";
    	String username="root";
    	String password="Bindu@123";
    	//get connection to the db
    	//creating object to get connection
    	Connection bin=DriverManager.getConnection(url,username,password);
    	//a statement to execute a query
    	Statement st=bin.createStatement();
    	//execution of query and storing the response in resultset rs
    	ResultSet rs=st.executeQuery("select * from mobile");
    	//checking for response
    	System.out.println("mobileid\tmobilename\tmobileprice");
    	while(rs.next())
    	{
    		//reading the mobiledata from response
    		String mobiledata=rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3);
    		//printing mobiledata
    		System.out.println(mobiledata);
    	}
          //closing the connection
    	
    	
    	bin.close();
    }
}
