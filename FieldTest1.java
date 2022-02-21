package com.kh.chap04_field.model.vo;

/*
 * * 변수 구분  
 * - 전역변수 (전지역): 클래스 영역 안에 바로 선언하는 변수 =>클래스 내에서면 어디서든 사용 가능   
 * - 지역변수             : 클래스 영역 내에 어떤 특정한 구역 ({}) 에 선언한 변수=> 메소드, 제어문(for문,if문)
 * 
 * 1. 전역변수 
 * - 멤버변수  (인스턴스변수, 필드)
 * 생성시점 (쓸수 있는 시점): new 연산자를 통해서 해당 객체가 생성되는 순간 메모리 영역에 할당=> 메모리의 heap 영역
 * 소멸시점: 객체가 소멸할때 같이 소멸(GC가 청소해주는 시점)  
 *  
 * - 클래스변수 ( static 변수) : 예약어로써 static 이라는 키워드가 붙고 안붙고의 차이만으로!!
 * 생성시점: 프로그램 시작과 동시에 메모리 영역에 할당 (붙박이), 즉 객체 생성이 되지 않더라도 바로 사용 가능 => 메모리의 static 영역 
 * 소멸시점: 프로그램이 종료되는 시점에서 같이 소멸 
 *  
 * => static : 곧바로 실행할 준비가 되어있는 애들 지칭(즉, 실행전에 객체를 생성하는 단계가 필요 없다)
 * 
 * 
 * 2. 지역변수 (매개변수도 일종의 지역변수!)
 * 생성시점: 특정한 구역 ({}) 실행 시 해당 코드가 실행될 때 메모리 영역에 할당 => 기본자료형일 경우는 메모리의 stack 영역
 * 소멸시점: 특정한 구역 ({}) 실행이 종료 될 때 같이 소멸  (예를 들면 메소드 종료 시, for 문이 종료될때)   
 */

// 변수 선언 위치에 따른 구분(전역변수, 지역변수,매개변수)
public class FieldTest1 {  //FieldTest1 클래스 영역 시작

	//멤버변수 ==인스턴스변수==전역변수==필드
	private int global;
	
    public void test(int num) {   //test 메소드 영역 시작
    	//int num: 매개변수(일종의 지역변수 개념)
    	
    	//System.out.print(local); //선언 전에는 아예 사용 불가!
    	int local =0;   //local 지역변수임! /지역변수: 선언시 초기화 하는 습관을 들이자! 
    	                //       '=0;'하는것이 초기화      => 이 시점에서local 변수가 할당됨
    	//System.out.print(local);  //초기화를 하지 않으면 쓸 수 없음
        
    	System.out.println(global);  //멤버변수 출력
    	System.out.println(num);     //매개변수 출력
    	System.out.println(local);   //지역변수 출력
    	
    }//test 메소드 영역 끝
	
	
	
	
	
	
}//FieldTest1 클래스 영역 끝












