package com.springdemos.SpringCore.QuesAns;

public class Answers {

	int id;
	String answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Answers [id=" + id + ", answers=" + answers + "]";
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
}
