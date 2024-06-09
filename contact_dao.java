package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.bo.*;

public class contact_dao
{
	public static Connection getconnection()
	{
		Connection con=null;
		try {
			String url="jdbc:mysql://localhost:3306/shope";
			String un="root";
			String pass="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,un,pass);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	public static int contact(contact_bo bo)
	{
		Connection con=contact_dao.getconnection();
		int status=0;
		try {
			PreparedStatement ps=con.prepareStatement("insert into contact(name,number,email,feedback)values(?,?,?,?)");
			ps.setString(1,bo.getName());
			ps.setString(2,bo.getNumber());
			ps.setString(3,bo.getEmail());
			ps.setString(4,bo.getFeedback());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
}
