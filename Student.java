package com.kh.chap01_abstraction.model.vo;

/*
 * *클래스의 구조
 * 
 * public class 클래스명{
 * 
 *     // 필드부
 *     
 *     // 생성자부
 *     
 *     // 메소드부 
 *  }
 * 
 */

// 학생들을 추상화해서 만든 클래스
public class Student {  //com.kh.chap01_abstraction.model.vo.Student; =>풀네임

	
	// [필드부]
	// 필드 : 변수(값 1개를 담는 공간) => 자료형 변수명;   //클래스안에서 사용되는 변수: 지역변수
	// 접급제한자 자료형 필드명;
	
	//접근제한자:이 필드에 접근할수 있는 범위를 제한할 수 있는 키워드 
	//        (public > protected > default > private)
	//         클래스 영역 안에서 필드를 선언할 때 반드시 접근제한자를 써줘야 한다.
	//          생략 default => /*default*/ String name; 이런식으로 생략  
	
	/*
	 * 캡슐화: 필드에 담긴 값을 숨겨주겠다.
	 *        1단계) 접근제한자 부분을 private 으로 바꿔주면 됨
	 *              => 그럼 값을 바꾸거나 조회해야 할 경우는?
	 *        2단계) 직접접근이 불가능하므로 이제는 간접적으로나마 접근할수 있게끔 처리를 추가해줘야 함
	 *              => 간접적으로 값을 대입시켜주거나, 간접적으로 값을 조회시켜주는 메소드들을 만들어 주면 됨
	 *                  => 메소드부에 가서 만들면 됨      
	 *                      getter / setter 메소드 
	 */

//    public String name;
//    public int age;
//    public double height;  //퍼블릭에서 프라이빗으로 바꿔줌
	
	 private String name;
     private int age;
     private double height;	
    
    //[생성자부]
    
     
     
    //[메소드부]
	//메소드부: 각 기능들을 구현하는 부분
    /* 
     * [ 표현법 ]
     * public   void         method1()  (void 숨기다. 재료값도 없고 결과값도 없어. 그래서 넣는만큼 나온거 여태)
     * 접근제한자  반환할결과자료형 메소드이름(매개변수=>생략가능) { //매개변수==재료==(for문의 초기부분같은거) 
     *  
     *      실행할 코드;
     *  }
     */
	  
     // 데이터를 기록 및 수정하는 기능의 메소드 : setter 메소드
     // => 실행 내용이 필드에 값을 대입하는 구문 형식으로 작성
     // => 이때, 이 메소드는 접근 가능하도록 해야되기 때문에 항상 public 접근제한자를 사용해야 한다. 
     //void 쓰는 이유는 나올필요가 없어서 일단 set만들어 놓는 거임
     //필드에서는 간접적으로 해야 하고 메소드에서는 퍼블릭 직접적으로 해야 접근이 가능하다. 
     
     //필드 갯수 = setter 갯수 = getter 갯수
     //각 필드의 한개씩
     
     //이름값을 기록 및 수정할 수있는 기능의 메소드(name 이라는 필드에 값을 대입하는 용도)
     //public 반환자료형 메소드명(재료) {
        public void setName(String name) { 
    	 
    	       //변수명= 재료(값);  변수명앞에 this넣어줌
    	   this.name = name  ;  //관례상 name 같게 만들어줌 , this는 이 둘을 구분 시켜주기 위해서임(둘이 같아서 우선순위다르게 하기위해서)
    	                        //this는 필드안에 있는 name이다. 
     }
     
       //나이값을 기록 및 수정할수 있는 기능의 메소드(age라는 필드에 값을 대입하는 용도)
        public void setAge(int age) {   //int age는 메소드 변수, this age는 필드의 변수 
        	
        	this.age= age;
        }
       //키값을 기록 및 수정할수 있는 기능의 메소드(height라는 필드에 값을 대입하는 용도)
        
        public void setHeight(double height) {
        	 
        	this.height= height;
        }
     
        // 데이터를 반환해주는 기능의 메소드 : getter 메소드
        // name 이라는 필드에 담긴 값을 돌려주는 용도의 메소드
        //public 반환형 메소드명() {
        public  String getName() {  //반환시켜줘야 하니까 void말고 반환형 넣어주기
        	 //반환할 내용물=> return 구문(태초마을로 돌아가겠다)
        	//return 내용물;
        	return name; //return 결과값; : 결과값을 돌려주겠다.
        }
        
        //age라는 필드에 담긴 값을 돌려주는 용도의 메소드
        public int getAge() {
        	
        	return age;
        }
        
        //height라는 필드에 담긴 값을 돌려주는 용도의 메소드
        public double getHeight() {
        	
        	return height;
        }
     
	   //=> setter와 getter 메소드들까지 만들어주는 것이 캡슐화이다. 
       //=> 필드마다 꼭 1개씩은 만들어 줘야한다.
	
}
















