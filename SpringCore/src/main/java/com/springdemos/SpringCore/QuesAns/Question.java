package com.springdemos.SpringCore.QuesAns;

import java.util.List;

public class Question {

	int no;
	String ques;
	List<Answers> ans;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<Answers> getAns() {
		return ans;
	}
	public void setAns(List<Answers> ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [no=" + no + ", ques=" + ques + ", ans=" + ans + "]";
	}
	
	
}
