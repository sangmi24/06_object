package com.kh.chap03_class.model.vo;

public class Book {

	//필드부
	//도서명 :title
	//출판사명: publisher
	//저자명: author
	//가격: price
	//할인율: discountRate(0.1경우 10프로 할인)
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;

	//생성자부
	
	//메소드부
	//setter
	public void setTitle(String title) {
		this.title= title;
	}
	public void setPublisher(String publiser) {
		this.publisher=publiser;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate=discountRate;
	}
	//getter
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	//모든 필드를 하나의 문자열로 합쳐서 반환시켜주는 information
	public String information() {
		return "도서명: "+title+", 출판사명: "+publisher+", 저자명: "+author
				+", 가격: "+price+", 할인율: "+discountRate;
	}
	
	
}
