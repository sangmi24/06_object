package com.kh.chap03_class.model.vo;

//Ŭ�������� ��� ������ ���� ������ : public , default (���� ����)
/*default */ class Product {
	
	 //  /*default*/  class Product {
	 /* default ���� �������� ����
	 * �ٸ� ��Ű���� ������ ��� ���� �� �� ����!!
	 * ��, ���� ��Ű�� �ȿ� ������ ���� ���� �� �� ����!!
	 */

	//�ʵ��
	//��ǰ��, ��ǰ����, �귣��
	private String pName;
	private int price;
	private String brand = "����";  //����� ���ÿ� �ʱ�ȭ(���÷θ� �����ϰ������)
	
	//�����ں�
	
	//�޼ҵ�� 
	//setter �޼ҵ�3��
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//getter �޼ҵ�3��
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	// ��� �ʵ尪�� �ϳ��� ���ڿ��� ���ļ� ��ȯ���ִ� information
	public String information() {
		return "��ǰ�� : "+pName+", ����: "+price+ ", �귣��: "+brand;
	}
	
	
}
