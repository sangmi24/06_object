package com.kh.example.run;

import com.kh.example.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		//�⺻ �����ڸ� �̿��Ͽ� ù��° Book ��ü ����
		Book bk1= new Book();// jvm �� �ʱⰪ���� ����
		System.out.println(bk1.information());
		
		bk1.setTitle("�ڹ��� ����");
		bk1.setPrice(20000);
		bk1.setDiscountRate(0.2);
		bk1.setAuthor("����");
		
		//�Ű����� �����ڸ� �̿��Ͽ� �ι� ° Book ��ü ����
        Book bk2= new Book("C���",30000,0.1,"ȫ�浿");
		
		//��ü�� ���� �ʵ� �� ��� Ȯ��
        System.out.println(bk1.information());
		
		System.out.println("===================================");
        
		//ù ��° ��ü�� ���� ���� setter�� �̿��Ͽ� ����
		
		//������ ����  ��� Ȯ��
		System.out.println("������ ��� Ȯ��");
		System.out.println(bk2.information());
		System.out.println("===================================");
		
		//�� ��ü�� �������� ������ å ������ ����ؼ� ���
		//���ε� ����= ����-(����*������)
		System.out.println("������: "+bk2.getTitle());
		System.out.println("���ε� ���� : "+(int)(bk2.getPrice()-(bk2.getPrice()*bk2.getDiscountRate()))+"��");
	
		System.out.println("������: "+bk1.getTitle());
		System.out.println("���ε� ���� : "+(int)(bk1.getPrice()-(bk1.getPrice()*bk1.getDiscountRate()))+"��");
		
		
		
		
		
		
		
		
		
		
		

	}

}
