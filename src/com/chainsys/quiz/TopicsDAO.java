package com.chainsys.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TopicsDAO {
	public ArrayList<Topics> findAll(Topics topics ) throws Exception {
		ArrayList<Topics> topicList = new ArrayList<>();

		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select id,topics,questions from quiz_topics";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			ResultSet resultset = preparedStatement.executeQuery();

			while (resultset.next()) {
				topics = new Topics();
				topics.id = resultset.getInt("id");
				topics.topic = resultset.getString("topics");
				topics.questions = resultset.getInt("questions");

				topicList.add(topics);
			}
			ConnectionUtil.close(connection, preparedStatement, resultset);
		} catch (Exception e) {
			e.printStackTrace();
			// throw new Exception("unable to findAll");
		}
		return topicList;
	}
}
