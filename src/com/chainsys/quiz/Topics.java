package com.chainsys.quiz;

public class Topics {
	public int id;
	public String topic;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getQuestions() {
		return questions;
	}

	public void setQuestions(int questions) {
		this.questions = questions;
	}

	public int questions;

	@Override
	public String toString() {
		return "Topics [id=" + id + ", topic=" + topic + ", questions="
				+ questions + "]";
	}
}
