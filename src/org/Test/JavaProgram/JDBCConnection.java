package org.Test.JavaProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=null;
		
		//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","admin" );
		//write a query
		String sql="Select * from employees";
		//prepare the statement
		PreparedStatement ps=con.prepareStatement(sql);
		//execute the query
		ResultSet rs= ps.executeQuery();
		//iterate
		while(rs.next())
		{
			String name=rs.getString("first_name");
			int sal=rs.getInt("salary");
			System.out.println(name);
			System.out.println(sal);
		}
		//close
		con.close();
		
	}

}
