package com.kh.chap03_class.model.vo;

public class Person {

	//필드부
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//비밀번호나 생년월일 핸드폰번호 => 문자열로 취급함
	
	//생성자부
	
	//메소드부
	//setter 7개
	public void setId(String id ) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setEmail(String email) {
		this.email=email;
	}	
	
	//getter
	  public String getId() {
		  return id;
	  }
	  public String getPwd() {
		  return pwd;
	  }
	  public String getName() {
		  return name;
	  }
	  public int getAge() {
		  return age;
	  }
	  public char getGender() {
		  return gender;
	}
	 public String getPhone() {
		 return phone;
	 }
	public String getEmail() {
		return email;
	}
	 
	//모든 필드값을 하나의 문자열로 합쳐서 반환해주는 메소드
	//information 메소드 내보내야 해서 반환형을 String으로 
	public String  information() {
		return  "id: "+ id +", pwd: "+ pwd + ", name: " +name+ ", age: " +age + ", gender: "+gender+
				 ", phone: "+phone+ ", email: "+email;
	}
	
	
	
	
	
}
