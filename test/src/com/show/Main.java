package com.show;

import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Connection;

public class Main {
	public static void main(String[] args) throws Exception{

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		ResultSet rn = (ResultSet) connection.prepareStatement("select * from emp5").executeQuery();
		while(rn.next()){
			System.out.println(rn.getInt(1));

			System.out.println(rn.getString(2));
		}
		connection.close();
	}

}
