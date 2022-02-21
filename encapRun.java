package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
	
	/*
	 * 8�ܰ�. ĸ��ȭ �۾��� ���� �Ϻ��� Ŭ������ ���¸� ���߰� ����.
	 * 
	 * ĸ��ȭ�� ���� ������ : �ܺηκ��� ���������� �����ϱ� ������
	 *                  �Ժη� ���� �����ǰų� ��ȸ�� ���� ���ϴ� ���� �߻�
	 * => ĸ��ȭ �۾��� �ؾ���!                 
	 * "��ü������ ���� ��Ģ �� �������� ���" �� �߿� �ϳ��� ĸ��ȭ
	 * "�������� ���� ������ ����"�ϴ� ��Ģ���� �Ͽ� �ܺηκ��� "���� ������ ����" ��� ����
	 * ��, ��ſ� ���� ���������γ��� ó��(��ȸ �Ǵ� ����) �� �� �ְԲ� �޼ҵ���� Ŭ���� ���ο� ���� ���� ����
	 * 
	 * ĸ��ȭ�� �ܰ�
	 * 1) �� �ʵ忡 ���������ڷ� private �� �ٿ��� �����
	 *    ��) �л� �������� ���α׷�: �л����� ������ ������ �Ժη� ������ �� ���� ���������� ����!
	 *                         �л����� �ٸ� �л��� ������ �Ժη� ��ȸ�� �� ���� ���������� ����!
	 * 2) setter / getter �޼ҵ� �����
	 *    ��) �л� �������� ���α׷�: �������� �л����� ������ ����ϰų� ���� ������ �� �ְԲ� ���å�� �������ش�.(setter �޼ҵ�)
	 *                         �������� �л����� ������ ��ȸ�� �� �ְԲ� ���å�� �������ش�. (getter �޼ҵ�)
	 * 
	 *                          
	 * + �߰� : �Ź� ���� ��½� ��¹� �ۼ��ϱ� �������ϱ� information �� ����� ����.                         
	 * 
	 */
	
	
	

	public static void main(String[] args) {
				
		//1�ܰ�. �л������� ���� �л� ��ü ����
		Student hong = new Student();  //��ü ���� == �ν��Ͻ�ȭ�Ѵ�. //�ν��Ͻ�(��ü)
		//�� ���������� name = null, age=0, height=0.0 (jvm�� ����)
		
		//2�ܰ�. �� ����
//		hong.name = "ȫ�浿";
//		hong.age= 20;
//		hong.height= 177.3;
		// ���� ���� ������ ��쿡�� ���� ������ �Ұ������� is not visible �̶�� ������ �߻�
		// ���������� ���Ҵٸ� ���������γ��� ������ �� �ֵ��� setter / getter �޼ҵ带 �������
		// ���� ���Ե�, ���� ��µ� �޼ҵ� ȣ���� ���� �ϰڴ�.
		
		
		//���� �����ϴ� �뵵�� setter �޼ҵ带 ȣ���غ���
		hong.setName("ȫ�浿");
		hong.setAge(20);
		hong.setHeight(177.3);
		
		//3�ܰ�. �� ����ֳ� ��ȸ 
//		System.out.println(hong.name);
//		System.out.println(hong.age);
//		System.out.println(hong.height);
		//=> ĸ��ȭ �� (���� ���)
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		//=> ���� ������ ���� �ѹ� ��ȸ�ؼ� ���ڴ�.
		
		// xxx���� ���̴� xx���̰�, Ű�� xxxcm �Դϴ�. �������� ���
//		System.out.printf("%s���� ���̴� %d���̰�, Ű�� %.1f cm �Դϴ�. \n",
//				hong.getName(),hong.getAge(),hong.getHeight());
		
		System.out.println(hong.information());
		
		
		//�迵�� �л��̶�� ��ü�� ��������
		//��ü��: kim(����21��, Ű 169.4)
		
		Student kim = new Student();
		
		kim.setName("�迵��");
		kim.setAge(21);
		kim.setHeight(169.4);
//		
//		System.out.println(kim.getName());
//		System.out.println(kim.getAge());
//		System.out.println(kim.getHeight());
//		
//		System.out.printf("%s���� ���̴� %d���̰�, Ű�� %.1f cm�Դϴ�.\n"
//				, kim.getName(),kim.getAge(),kim.getHeight());
		
        System.out.println(kim.information());
		
	}

}






