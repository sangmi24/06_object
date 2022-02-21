package com.kh.chap03_class.model.vo;

//클래스에서 사용 가능한 접근 제한자 : public , default (생략 가능)
/*default */ class Product {
	
	 //  /*default*/  class Product {
	 /* default 접근 제한자의 경우는
	 * 다른 패키지에 존재할 경우 갖다 쓸 수 없음!!
	 * 단, 같은 패키지 안에 존재할 경우는 갖다 쓸 수 있음!!
	 */

	//필드부
	//상품명, 상품가격, 브랜드
	private String pName;
	private int price;
	private String brand = "애플";  //선언과 동시에 초기화(애플로만 고정하고싶을때)
	
	//생성자부
	
	//메소드부 
	//setter 메소드3개
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//getter 메소드3개
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	// 모든 필드값을 하나의 문자열로 합쳐서 반환해주는 information
	public String information() {
		return "상품명 : "+pName+", 가격: "+price+ ", 브랜드: "+brand;
	}
	
	
}
