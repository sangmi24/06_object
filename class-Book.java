package com.kh.chap03_class.model.vo;

public class Book {

	//�ʵ��
	//������ :title
	//���ǻ��: publisher
	//���ڸ�: author
	//����: price
	//������: discountRate(0.1��� 10���� ����)
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;

	//�����ں�
	
	//�޼ҵ��
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
	//��� �ʵ带 �ϳ��� ���ڿ��� ���ļ� ��ȯ�����ִ� information
	public String information() {
		return "������: "+title+", ���ǻ��: "+publisher+", ���ڸ�: "+author
				+", ����: "+price+", ������: "+discountRate;
	}
	
	
}
