package com.chainsys.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class QuesterDAO {
		public ArrayList<Quester> findAll() throws Exception {
			Quester quester;
			ArrayList<Quester> questerList = new ArrayList<>();
		try {
			Connection connection = ConnectionUtil.getConnection();
						String sql = "select id,question,option1,option2,option3 from quester_answers";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			ResultSet resultset = preparedStatement.executeQuery();
			//System.out.println(resultset);
			while (resultset.next()) {
				quester = new Quester();
				quester.setId(resultset.getInt("id"));
				quester.setQuestion(resultset.getString("question"));
				quester.setOption1(resultset.getString("option1"));
				quester.setOption2(resultset.getString("option2"));
				quester.setOption3(resultset.getString("option3"));
				questerList.add(quester);
				System.out.println(quester);

			}
			ConnectionUtil.close(connection, preparedStatement, resultset);

		} catch (Exception e) {
			e.printStackTrace();
			//throw new Exception("Unable to selectByQuester");
		}
		return questerList;
		
		 }
	
}
