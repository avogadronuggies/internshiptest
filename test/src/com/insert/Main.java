package com.insert;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Main {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		PreparedStatement preparedStatement= (PreparedStatement) connection.prepareStatement("insert into emp5 values(?,?)");
		preparedStatement.setInt(1,1 );
		preparedStatement.setString(2, "Tom");
		preparedStatement.executeUpdate();
		System.out.println("inserted");
		connection.close();
		
	}
}
