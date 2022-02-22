package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		//�⺻������ ȣ�� �׽�Ʈ
		//�⺻�����ڸ� ȣ���ϴ� ���� == new �� ��ü�� �����ϴ� ����
		//Ŭ������ ��ü�� = new Ŭ������();
		//Ŭ������ ��ü�� = new �����ڸ�();
		User u1 = new User();
		
		System.out.println(u1.information());
		  //JVM�� ���� �⺻���� ���=> �⺻�������� ������ �� �������!
		
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("ȫ�浿");
		u1.setAge(20);
		u1.setGender('��');
		
		System.out.println(u1.information());
		
		//�Ű������� userId,userPwd,userName �� ������ ȣ�� �׽�Ʈ (��ŰƮ)
		User u2 = new User("user02","pass02","�踻��" );
		
		System.out.println(u2.information());
		// userId, userPwd, userName ������ �ʵ�� ��ü ������ ���ÿ�
		// ���� ���ϴ� ������ ä���� (����ǰ ������� )
		//��, ���� �Ű������� �������� ���� �ʵ忡 ���ؼ��� �⺻���� �״�� ������� (JVM�� ���ؼ� )
		
		// �׷� setter �޼ҵ尡 �ʿ���� �ʳ���??
		// �߰��� �Ϻ� �ʵ尪�� �ѵΰ� �ٲ�� ��Ȳ�� ����ٸ� setter �� ���� ���� �� ����
		u2.setAge(15);
		u2.setGender('��');
		
		System.out.println(u2.information());
		
		//��� �ʵ忡 ���ؼ� �Ű������� ������ �ִ� ������ ȣ�� �׽�Ʈ (����ǰ)
		User u3 = new User("user03","pass03","�̼���", 30 , '��');
		
		System.out.println(u3.information());
		// => ��ü ������ ���ÿ� ��� �ʵ忡 ���� ���ϴ� ������ ����ǰ�� �����ڴ�.
		
		
		
		
		
	}

}









