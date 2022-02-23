package com.kh.example.run;

import com.kh.example.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		//기본 생성자를 이용하여 첫번째 Book 객체 생성
		Book bk1= new Book();// jvm 이 초기값으로 셋팅
		System.out.println(bk1.information());
		
		bk1.setTitle("자바의 정석");
		bk1.setPrice(20000);
		bk1.setDiscountRate(0.2);
		bk1.setAuthor("윤상섭");
		
		//매개변수 생성자를 이용하여 두번 째 Book 객체 생성
        Book bk2= new Book("C언어",30000,0.1,"홍길동");
		
		//객체가 가진 필드 값 출력 확인
        System.out.println(bk1.information());
		
		System.out.println("===================================");
        
		//첫 번째 객체가 가진 값을 setter을 이용하여 수정
		
		//수정된 내용  출력 확인
		System.out.println("수정된 결과 확인");
		System.out.println(bk2.information());
		System.out.println("===================================");
		
		//각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		//할인된 가격= 가격-(가격*할인율)
		System.out.println("도서명: "+bk2.getTitle());
		System.out.println("할인된 가격 : "+(int)(bk2.getPrice()-(bk2.getPrice()*bk2.getDiscountRate()))+"원");
	
		System.out.println("도서명: "+bk1.getTitle());
		System.out.println("할인된 가격 : "+(int)(bk1.getPrice()-(bk1.getPrice()*bk1.getDiscountRate()))+"원");
		
		
		
		
		
		
		
		
		
		
		

	}

}
