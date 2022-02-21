package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		// Person 이라는 클래스로부터 객체를 생성
		// Person 클래스 == 내가 만든 자료형 (여러개의 자료형 변수들을 한개의 묶음으로 보관하겠다.)
		// p 객체 = Person 이라는 내가 만든 자료형에 해당되는 변수(참조형 변수==객체 ==인스턴스) 
		// 호출을 하는 거
		Person p = new Person();
		
		System.out.println(p.information()); //id: null, pwd: null, name: null, age: 0, gender: 
		//각 필드에는 기본값이 들어있음 => 기본형은 0, 0.0,' ' /문자열은 null
		
		//값 넣기 => setter메소드
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("홍길동");
		
		System.out.println(p.information());
		//채운값+기본값
		
		p.setAge(23);
		p.setGender('남');
		p.setPhone("010-1111-2222");
		p.setEmail("aaa@naver.com");
		
		System.out.println(p.information());  //다 나옴
        
		System.out.println(p); //주소값
		
		
		// 상품 객체를 생성
		Product p1 = new Product();
		
		p1.setpName("아이폰11");
		p1.setPrice(1300000);
		//p1.setBrand("애플");
		
		System.out.println(p1.information());
		
		//상품을 추가하고 싶음! => 애플 아니면 안다룰래요 라는 상황
		Product p2 = new Product();
		
		p2.setpName("애플워치7");
		p2.setPrice(600000);
		//p2.setBrand("애플");
		
		System.out.println(p2.information());
		
		//brand 필드에 "애플"로 초기화 해 두었을 때에는
		//setter로 굳이 값을 담아두지 않아도 된다!
		
		//"apple"
		p1.setBrand("apple");
		System.out.println(p1.information());
		p2.setBrand("apple");
		System.out.println(p2.information());
		
		
		
		
		
	}

}
