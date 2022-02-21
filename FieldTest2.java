package com.kh.chap04_field.model.vo;


//필드에서 사용 가능한 접근제한자 4가지
public class FieldTest2 {

	/*
     *(+) public : 어디서든 (같은패키지, 다른패키지 모두) 접근 가능하도록 하고싶다. 
     *(#) protected : 같은패키지면 무조건 접근 가능,
     *                단, 상황에 따라서 다른패키지여도 접근 가능한 경우가 있다.
     *                "상속구조일 경우"에는 다른 패키지여도 접근 가능하다. => 상속에 대해서는 다다음시간쯤 배울것!
     *(~) default : 오로지 같은패키지일 경우에만 무조건 접근 가능, 생략시 자동으로 default로 잡힌다. 
     *(-) private : 오직 해당 클래스 내에서만 사용이 가능하다. 
     *
     *=> 위에서부터 아래로 내려갈수록 접근할수 있는 범위가 좁아진다. 제한이 더 커진다. 자유도가 낮아진다.
     *=> +, #, ~, - : 클래스 다이어그램 (설계도면)에서의 표기이다.  
     */
	
	//각 필드에 초기화도 가능하다.
	public String pub = "public";  
	protected String pro = "protected";
	/* default */ String df = "default";  //오히려 앞에 default를 붙이면 오류생김 생략시켜줘야 함
	private String pri = "private";
	
	public static String sta = "static 변수";  
	
	
	
	
	
	
	
	
	
	
	
	
}
