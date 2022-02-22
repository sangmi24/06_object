package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		//기본생성자 호출 테스트
		//기본생성자를 호출하는 구문 == new 로 객체를 생성하는 구문
		//클래스명 객체명 = new 클래스명();
		//클래스명 객체명 = new 생성자명();
		User u1 = new User();
		
		System.out.println(u1.information());
		  //JVM에 의해 기본값이 담김=> 기본생성자의 역할이 딱 여기까지!
		
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("홍길동");
		u1.setAge(20);
		u1.setGender('남');
		
		System.out.println(u1.information());
		
		//매개변수가 userId,userPwd,userName 인 생성자 호출 테스트 (밀키트)
		User u2 = new User("user02","pass02","김말똥" );
		
		System.out.println(u2.information());
		// userId, userPwd, userName 세가지 필드는 객체 생성과 동시에
		// 내가 원하는 값으로 채워짐 (완제품 만들어짐 )
		//단, 내가 매개변수로 제시하지 않은 필드에 대해서는 기본값이 그대로 담겨있음 (JVM에 의해서 )
		
		// 그럼 setter 메소드가 필요없지 않나요??
		// 중간에 일부 필드값만 한두개 바뀌는 상황이 생긴다면 setter 을 쓰는 것이 더 좋음
		u2.setAge(15);
		u2.setGender('남');
		
		System.out.println(u2.information());
		
		//모든 필드에 대해서 매개변수로 가지고 있는 생성자 호출 테스트 (완제품)
		User u3 = new User("user03","pass03","이순신", 30 , '남');
		
		System.out.println(u3.information());
		// => 객체 생성과 동시에 모든 필드에 내가 원하는 값으로 완제품을 만들어내겠다.
		
		
		
		
		
	}

}









