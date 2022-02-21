package com.kh.example.model.vo;

public class Student {
	//필드부
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	//생성자부	
	//메소드부
	//setter
	public void setGrade(int grade) {
		this.grade= grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	//getter
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	//information
	public String information() {
		return "학년 : "+grade+ " ,반: "+classroom+
				" ,이름: "+name+" , 키: "+height+" , 성별: "+gender;
	}
	
	
	
	
	
}
