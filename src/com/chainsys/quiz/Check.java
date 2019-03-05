package com.chainsys.quiz;

public class Check {
public int id;
public String option;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getOption() {
	return option;
}
public void setOption(String option) {
	this.option = option;
}
@Override
public String toString() {
	return "Check [id=" + id + ", option=" + option + "]";
}
}
