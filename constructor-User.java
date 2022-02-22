package com.kh.chap05_constructor.model.vo;

public class User {

	//필드부
	private String userId; //사용자의 아이디
	private String userPwd; //사용자의 비밀번호
	private String userName; //사용자의 이름
	private int age; //사용자의 나이
	private char gender; //사용자의 성별
	
	//생성자부
	/*
	 * *생성자
	 * 이름이 클래스명과 같고 리턴 자료형(반환형)이 없는 일종의 메소드(리턴자료형 생략됨)
	 * 객체가 생성( new 클래스명(); )될때 호출되는 메소드
	 * 기본적으로 매개변수가 없는 기본 형태의 생성자를 JVM 이 만들어준다. 
	 * 
	 * [ 표현법 ]  (반환형)   메소드명
	 *  //public (리턴자료형) 클래스명() {
	 *  
	 /* public  클래스명(매개변수=> 생략가능) {
	 *        실행할코드;    
	 *  }
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성하기 위함
	 * 2. 객체를 생성할 뿐만 아니라 매개변수로 전달된 값을 곧바로 필드에 초기화할 목적
	 *    (참고=> 배열에서 선언과 동시에 내가 원하는 값으로 초기화했던 것 같이보기!)
	 * 
	 * 생성자를 작성할 때 주의할점
	 * 1. 생성자의 이름은 반드시 클래스명과 동일해야함(대소문자구분 확실히! 토씨하나 안틀리고)
	 * 2. 반환형을 작성하지 않는다. (메소드와 유사하게 생겨서 헷갈릴 수 있음)
	 * 3. 같은 이름으로 여러개 작성이 가능, 단 , 매개변수가 중복되지 않는 경우에만 중복작성 가능
	 * 4. 매개변수가 있는 생성자를 명시적으로 작성하게 되면 기본생성자를 JVM이 자동으로 만들어주지 않음!(중요한 특징)
	 * 
	 *  즉, 어찌되었던 간에 기본생성자는 항상 만드는 습관을 들이자!
	 */
	//public 클래스명(매개변수) {
	   public User() {
		  
		  // 기본 생성자 : 매개변수가 없는 생성자
		  // => 단지 객체를 생성할 목적으로 작성한다.  (new 연산자를 이용하여 호출당할때 heap 영역에 할당하겠다.공간확보) 
		  // 보통 비워놓는다. 
		  // 기본생성자를 생략하는 경우=> 오류가 나지 않음
		  // JVM 이 자동으로 기본생성자를 만들어줬기 떄문에 항상 객체 생성이 가능했음
		  // 단, 매개변수가 있는 생성자가 추가적으로 작성되어있을 경우
		  // 기본생성자를 JVM이 자동으로 만들어주지 않기 때문에 
		  // 이 경우에는 기본생성자를 반드시 작성해줘야 한다.
		  //=> 항상 기본생성자는 만들자! 
		   
		 // System.out.println("잘 호출 되나..?");
		  
	}
	
	  //매개변수는 하나라도 다르면 됨- 오류 안뜸
	 public User( String userId, String userPwd, String userName ) {
		 
		 this.userId = userId;
		 this.userPwd = userPwd;
		 this.userName = userName;
		 
	 }

	 public User (String userId, String userPwd, String userName ,int age, char gender ) {
		 
		 // 모든 필드에 대해서 매개변수로 갖고있는 생성자 : 필드가 5개면 매개변수도 5개다.
		 // => 객체를 생성하고 그 순간 내가 원하는 값으로 초기화까지 시킬 목적
		 // 항상 만드는 습관이 필수는 아니나, 그래도 만드는 게 편함!
		 
		 /*
		 this.userId = userId;
		 this.userPwd = userPwd;
		 this.userName = userName;
		 */
		 this(userId, userPwd, userName);
		 // 위와 같이 중복되는 동일한 초기화 하는 내용의 생성자가 이미 존재할 경우
		 // this 라는 생성자를 호출 가능
		 // this 생성자 : 같은 클래스 내의 다른 생성자를 호출하는 구문
		 // 단, 주의사항은 반드시 생성자 내부 가장 윗줄에 작성해야 한다! 
		 
		 this.age = age;
		 this.gender = gender;
		 
	 }

	
	//메소드부
	//setter
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd= userPwd;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	//getter
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	//information
	public String information() {
		return "아이디: "+userId+", 비밀번호: "+userPwd+", 이름: "+userName+
				", 나이 : "+age+ ", 성별: "+gender;
	}
	
	
	
	
	
}
