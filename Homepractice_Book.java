package com.kh.example.model.vo;

public class Book {

	//鞘靛何
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	//积己磊何
    //扁夯 积己磊
	public Book() {
		
	}
	//肯丰 积己磊
	public Book(String title,int price,double discountRate,String author) {
		
		this.title=title;
		this.price= price;
		this.discountRate=discountRate;
		this.author=author;
	}	
	//皋家靛何
	//setter
	public void setTitle(String title) {
		this.title=title;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate=discountRate;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	//getter
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public String getAuthor() {
		return author;
	}
	
	//information
	public String information() {
			
		return title+"  "+price+"  "+discountRate+"  "+author;
	}
	
	
	
	
	
	
	
	
}
