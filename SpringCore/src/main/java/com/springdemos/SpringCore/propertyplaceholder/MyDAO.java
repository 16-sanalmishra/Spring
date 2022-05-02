package com.springdemos.SpringCore.propertyplaceholder;

public class MyDAO {

	String dbuser;
	String dburl;
	String dbpassword;
	@Override
	public String toString() {
		return "MyDAO [dbuser=" + dbuser + ", dburl=" + dburl + ", dbpassword=" + dbpassword + "]";
	}
	public MyDAO(String dbuser, String dburl, String dbpassword) {
		super();
		this.dbuser = dbuser;
		this.dburl = dburl;
		this.dbpassword = dbpassword;
	}
	
}
