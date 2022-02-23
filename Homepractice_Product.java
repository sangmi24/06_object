package com.kh.example.model.vo;

public class Product {

	//鞘靛何
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	//积己磊何
	//扁夯
	public Product() {
		
	}
	//葛电 积己磊 
    public Product(String productId,String productName,
    		String productArea,int price,double tax) {
		this.productId=productId;
		this.productName=productName;
		this.productArea=productArea;
		this.price=price;
		this.tax=tax;
	}	
	//皋家靛何
    //setter
    public void setProductId(String productId) {
    	this.productId=productId;
    }
    public void setProductName(String productName) {
    	this.productName=productName;
    }
    public void setProductArea(String productArea) {
    	this.productArea=productArea;
    }
    public void setPrice(int price) {
    	this.price= price;
    }
    public void setTax(double tax) {
    	this.tax= tax;
    }
    //getter
    public String getProductId() {
    	return productId;
    }
    public String getProductName() {
    	return productName;
    }
    public String getProductArea() {
    	return productArea;
    }
    public int getPrice() {
    	return price;
    }
    public double getTax() {
    	return tax;
    }
	//information
    public String information() {
    	return productId +"  "+ productName +"  "+ productArea +"  "
                 + price +"  "+ tax;
    }
    
    
    
	
	
}
