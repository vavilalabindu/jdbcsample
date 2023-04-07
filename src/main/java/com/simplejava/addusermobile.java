package com.simplejava;
import java.sql.*;
import java.util.Scanner;
public class addusermobile {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/oneplus";
		String username="root";
		String password="Bindu@123";
		Connection bin=DriverManager.getConnection(url,username,password);
		
		Scanner bs=new Scanner(System.in);
		System.out.println("********Add Your MobileData to DB**********");
		System.out.println("enter mobileid");
		int mid=bs.nextInt();
		System.out.println("enter mobilename");
		bs.nextLine();
		String mname=bs.nextLine();
		System.out.println("enter mobileprice");
		int mprice=bs.nextInt();
		
		String query="insert into mobile values(?,?,?)";
		PreparedStatement pst=bin.prepareStatement(query);
		pst.setInt(1, mid);
		pst.setString(2, mname);
		pst.setInt(3, mprice);
		
		int count=pst.executeUpdate();
		System.out.println(count+" row(s) effected");
		bin.close();
		bs.close();
		
		
		
		
		
		

	}

}
