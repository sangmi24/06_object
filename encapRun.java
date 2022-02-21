package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
	
	/*
	 * 8단계. 캡슐화 작업을 통해 완벽한 클래스의 형태를 갖추게 하자.
	 * 
	 * 캡슐화를 하지 않으면 : 외부로부터 직접접근이 가능하기 때문에
	 *                  함부로 값이 변질되거나 조회를 막지 못하는 문제 발생
	 * => 캡슐화 작업을 해야함!                 
	 * "객체지향의 설계 원칙 중 정보은닉 기술" 그 중에 하나가 캡슐화
	 * "데이터의 직접 접근을 제한"하는 원칙으로 하여 외부로부터 "직접 접근을 막자" 라는 취지
	 * 단, 대신에 값에 간접적으로나마 처리(조회 또는 대입) 할 수 있게끔 메소드들을 클래스 내부에 같이 만들어서 관리
	 * 
	 * 캡슐화의 단계
	 * 1) 각 필드에 접근제한자로 private 을 붙여서 숨기기
	 *    예) 학생 성적관리 프로그램: 학생들이 본인의 성적을 함부로 조작할 수 없게 직접접근을 막자!
	 *                         학생들이 다른 학생의 성적을 함부로 조회할 수 없게 직접접근을 막자!
	 * 2) setter / getter 메소드 만들기
	 *    예) 학생 성적관리 프로그램: 선생님은 학생들의 성적을 기록하거나 수정 가능할 수 있게끔 대안책을 마련해준다.(setter 메소드)
	 *                         선생님은 학생들의 성적을 조회할 수 있게끔 대안책을 마련해준다. (getter 메소드)
	 * 
	 *                          
	 * + 추가 : 매번 정보 출력시 출력문 작성하기 귀찮으니까 information 도 만들면 좋다.                         
	 * 
	 */
	
	
	

	public static void main(String[] args) {
				
		//1단계. 학생정보를 담을 학생 객체 생성
		Student hong = new Student();  //객체 생성 == 인스턴스화한다. //인스턴스(객체)
		//이 시점까지는 name = null, age=0, height=0.0 (jvm에 의해)
		
		//2단계. 값 대입
//		hong.name = "홍길동";
//		hong.age= 20;
//		hong.height= 177.3;
		// 위와 같이 대입할 경우에는 직접 접근이 불가해져서 is not visible 이라는 오류가 발생
		// 직접접근을 막았다면 간접적으로나마 접근할 수 있도록 setter / getter 메소드를 만들었음
		// 값의 대입도, 값의 출력도 메소드 호출을 통해 하겠다.
		
		
		//값을 대입하는 용도의 setter 메소드를 호출해보자
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(177.3);
		
		//3단계. 잘 담겨있나 조회 
//		System.out.println(hong.name);
//		System.out.println(hong.age);
//		System.out.println(hong.height);
		//=> 캡슐화 전 (기존 방법)
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		//=> 정보 은닉을 위해 한번 우회해서 가겠다.
		
		// xxx님의 나이는 xx살이고, 키는 xxxcm 입니다. 형식으로 출력
//		System.out.printf("%s님의 나이는 %d살이고, 키는 %.1f cm 입니다. \n",
//				hong.getName(),hong.getAge(),hong.getHeight());
		
		System.out.println(hong.information());
		
		
		//김영희 학생이라는 객체를 만들어보세요
		//객체명: kim(나이21살, 키 169.4)
		
		Student kim = new Student();
		
		kim.setName("김영희");
		kim.setAge(21);
		kim.setHeight(169.4);
//		
//		System.out.println(kim.getName());
//		System.out.println(kim.getAge());
//		System.out.println(kim.getHeight());
//		
//		System.out.printf("%s님의 나이는 %d살이고, 키는 %.1f cm입니다.\n"
//				, kim.getName(),kim.getAge(),kim.getHeight());
		
        System.out.println(kim.information());
		
	}

}






