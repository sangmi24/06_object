package com.kh.chap02_encapsulation.model.vo;

public class Student {

	//�ʵ��
	/*
	 * �ʵ� == ������� == �ν��Ͻ�����
	 * 
	 * ����������[�����] �ڷ��� �ʵ��; //������ ����������
	 */
	private String name;
	private int age;
	private double height;
	
	//�����ں�
	
	//�޼ҵ��
	/*
	 * ������ ���ڸ��� getter /setter �޼ҵ带 �ۼ�
	 * 
	 * �޼ҵ� Ʋ
	 * ���������� ��ȯ�� �޼ҵ��(�Ű�����=>��������){
	 *      �����ڵ�;
	 * }
	 * 
	 * setter �޼ҵ�Ʋ
	 * public void set�ʵ��(�ش��ʵ�͵������ڷ���  �ش��ʵ�͵����ѸŰ�������) {  //����ο� �ִ� �ʵ�� �״�� �ֱ�
	 *    this.�ʵ�� =  �Ű�������;   
	 * }
	 * 
	 * getter �޼ҵ�Ʋ
	 * public �ش��ʵ�͵������ڷ��� get�ʵ��() {
	 *     return �ʵ��;
	 * }
	 * 
	 */
	// setter �޼ҵ��
	public void setName(String name) {
		this.name = name;
	}
    public void setAge(int age) {
    	this.age = age;
    }
    public void setHeight(double height) {
    	this.height = height;
    }
    
	//getter
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
	public double getHeight() {
		return height;
	}
	//������� ĸ��ȭ!
	
	// �� ��ü���� ��� ������ �Ȱ��� �ۼ����� (�ʿ��Ҷ����� ȣ���ؼ� ��Ȱ���� ����)
	//=> ��ť�� ���� �ʵ忡 ����ִ� ��� ������ �ϳ��� ���ڿ��� ���ļ� �����ؼ� �������ִ� �޼ҵ�
	//public ��ȯ�� �޼ҵ��
	public String information() {
		//return name, age,height ; //return ���� �ۼ��� ������� �Ѱ����̿��� �Ѵ�!!
		return name +"���� ���̴�"+ age + "���̰�, Ű�� "+ height +"cm�Դϴ�.";
	}
	
	
}













