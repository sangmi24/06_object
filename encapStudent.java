package com.kh.chap02_encapsulation.model.vo;

public class Student {

	//필드부
	/*
	 * 필드 == 멤버변수 == 인스턴스변수
	 * 
	 * 접근제한자[예약어] 자료형 필드명; //예약어는 생략가능함
	 */
	private String name;
	private int age;
	private double height;
	
	//생성자부
	
	//메소드부
	/*
	 * 보통은 이자리에 getter /setter 메소드를 작성
	 * 
	 * 메소드 틀
	 * 접근제한자 반환형 메소드명(매개변수=>생략가능){
	 *      실행코드;
	 * }
	 * 
	 * setter 메소드틀
	 * public void set필드명(해당필드와동일한자료형  해당필드와동일한매개변수명) {  //선언부에 있는 필드명 그대로 넣기
	 *    this.필드명 =  매개변수명;   
	 * }
	 * 
	 * getter 메소드틀
	 * public 해당필드와동일한자료형 get필드명() {
	 *     return 필드명;
	 * }
	 * 
	 */
	// setter 메소드들
	public void setName(String name) {
		this.name = name;
	}
    public void setAge(int age) {
    	this.age = age;
    }
    public void setHeight(double height) {
    	this.height = height;
    }
    
	//getter
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
	public double getHeight() {
		return height;
	}
	//여기까지 캡슐화!
	
	// 각 객체별로 출력 구문을 똑같이 작성했음 (필요할때마다 호출해서 재활용의 목적)
	//=> 한큐에 현재 필드에 담겨있는 모든 값들을 하나의 문자열로 합쳐서 포장해서 내보내주는 메소드
	//public 반환형 메소드명
	public String information() {
		//return name, age,height ; //return 구문 작성시 결과값은 한개뿐이여야 한다!!
		return name +"님의 나이는"+ age + "살이고, 키는 "+ height +"cm입니다.";
	}
	
	
}













