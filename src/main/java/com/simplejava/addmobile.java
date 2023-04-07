package com.simplejava;
import java.sql.*;

public class addmobile {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated methOd stub
		//load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/oneplus";
		String username="root";
		String password="Bindu@123";
		//get connection to the db
		//create object to get connection
		Connection bin=DriverManager.getConnection(url,username,password);
		
		int mid=10;
		String mname="vivo";
		int mprice=123;
		String query="insert into mobile values(?,?,?)";
		
		//creating prepareStatement to insert data
		PreparedStatement pst=bin.prepareStatement(query);
		pst.setInt(1,mid);
		pst.setString(2,mname);
		pst.setInt(3,mprice);
		
		int count=pst.executeUpdate();
		System.out.println(count+"row(s) affected(created)");
		
		bin.close();
		
		
		
		
		
		
		
	}

}
