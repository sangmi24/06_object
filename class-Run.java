package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		// Person �̶�� Ŭ�����κ��� ��ü�� ����
		// Person Ŭ���� == ���� ���� �ڷ��� (�������� �ڷ��� �������� �Ѱ��� �������� �����ϰڴ�.)
		// p ��ü = Person �̶�� ���� ���� �ڷ����� �ش�Ǵ� ����(������ ����==��ü ==�ν��Ͻ�) 
		// ȣ���� �ϴ� ��
		Person p = new Person();
		
		System.out.println(p.information()); //id: null, pwd: null, name: null, age: 0, gender: 
		//�� �ʵ忡�� �⺻���� ������� => �⺻���� 0, 0.0,' ' /���ڿ��� null
		
		//�� �ֱ� => setter�޼ҵ�
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("ȫ�浿");
		
		System.out.println(p.information());
		//ä�+�⺻��
		
		p.setAge(23);
		p.setGender('��');
		p.setPhone("010-1111-2222");
		p.setEmail("aaa@naver.com");
		
		System.out.println(p.information());  //�� ����
        
		System.out.println(p); //�ּҰ�
		
		
		// ��ǰ ��ü�� ����
		Product p1 = new Product();
		
		p1.setpName("������11");
		p1.setPrice(1300000);
		//p1.setBrand("����");
		
		System.out.println(p1.information());
		
		//��ǰ�� �߰��ϰ� ����! => ���� �ƴϸ� �ȴٷ귡�� ��� ��Ȳ
		Product p2 = new Product();
		
		p2.setpName("���ÿ�ġ7");
		p2.setPrice(600000);
		//p2.setBrand("����");
		
		System.out.println(p2.information());
		
		//brand �ʵ忡 "����"�� �ʱ�ȭ �� �ξ��� ������
		//setter�� ���� ���� ��Ƶ��� �ʾƵ� �ȴ�!
		
		//"apple"
		p1.setBrand("apple");
		System.out.println(p1.information());
		p2.setBrand("apple");
		System.out.println(p2.information());
		
		
		
		
		
	}

}
