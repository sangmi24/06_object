package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;

public class MethodRun {

	public static void main(String[] args) {
		
		
		//-------------1. MethodTest1 Ŭ����--------------
		MethodTest1 m1 = new MethodTest1();
		
		m1.method1();
		
		System.out.println("-------------------------------");
		
		//int random= m1.method2();
		//System.out.println("������: "+random);
		System.out.println("������: "+m1.method2());
		
		System.out.println("--------------------------------");
		
		m1.method3(20, 10);  // ����, ����, �ڷ����� �¾� �������� �Ѵ�. 
		
		System.out.println("--------------------------------");
		
		//m1.method4(42,2);  => �̷��� ����� �ȵ�. ����Ʈ�ȿ� �־���� ��
		System.out.println("���� ��: "+ m1.method4(42, 2));
		
		/*
		 * ��ȯ���� �ְ� ���� ����
		 * ��ȯ���� �ִ� ���(void�� �ƴѰ��) : �޼ҵ带 ȣ���ϴ� ������ �� ��ȯ���� �´� ������ �����ؼ� ����� �����ϴ� ���� (�޼ҵ�2,4��)
		 * ��ȯ���� ���� ���: ������ ������� ������ �޼ҵ� ������ ����� ����ϴ� ���� (�޼ҵ�1,3��)
		 */
		System.out.println("--------------------------------");
		
		MethodTest2.method1();
		
		System.out.println("--------------------------------");
		// String str =MethodTest2.method2();  �̷��� �ص� �ǰ�
		System.out.println(MethodTest2.method2());
		
		System.out.println("--------------------------------");
		MethodTest2.method3("ȫ�浿", 20);
	  
		System.out.println("--------------------------------");
		System.out.println(MethodTest2.method4(10, 6, '-'));
		
		/*
		 * static �޼ҵ��� ��쿡�� new ������ ��ü�� ������ �ʿ䰡 ����
		 * static�� ���� Ŭ���������� ���������� �޼ҵ� ���� ���α׷� ���� �ÿ�
		 * �޸��� static �̶�� ������ ������ �Ҵ�(����)�ȴ�.
		 */
		
		
	}

}








