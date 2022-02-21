package com.kh.chap04_field.model.vo;

public class Test {

	public static void main(String[] args) {
		
		//FieldTest2객체 생성
		 FieldTest2 f2 = new FieldTest2();
		 //=> import 할 필요 x (같은 패키지니까)
		 
		 //public => 어디서든 직접접근 가능
		 System.out.println(f2.pub); //public
	     
		 //protected => 같은패키지일 경우 무조건 직접접근 가능, 다른패키지일 경우 상속관계일때만 가능  
		 System.out.println(f2.pro); //protected
		 
		 //default => 같은패키지일경우 무조건 직접접근 가능, 다른패키지일 경우는 무조건 불가
		 System.out.println(f2.df);  //default

		 //private => 오로지 해당 클래스 내에서만 직접접근 가능 
		 //System.out.println(f2.pri); //xxx is not visible
		

	}

}
