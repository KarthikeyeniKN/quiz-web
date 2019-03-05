package com.chainsys.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class LoginDAO {

	public void addLogin(Login login) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		try {
			
			String sql = "insert into login_details(name,password) values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,login.name);
			preparedStatement.setString(2,login.password);
			//System.out.println(login.name+login.password);
			int rows = preparedStatement.executeUpdate();
			
			System.out.println("Rows inserted: " + rows);
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("unable to insert");
		}
	}

	private RequestDispatcher RequestDispatcher(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
