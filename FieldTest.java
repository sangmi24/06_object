package com.kh.chap04_field.model.vo;

public class Test {

	public static void main(String[] args) {
		
		//FieldTest2��ü ����
		 FieldTest2 f2 = new FieldTest2();
		 //=> import �� �ʿ� x (���� ��Ű���ϱ�)
		 
		 //public => ��𼭵� �������� ����
		 System.out.println(f2.pub); //public
	     
		 //protected => ������Ű���� ��� ������ �������� ����, �ٸ���Ű���� ��� ��Ӱ����϶��� ����  
		 System.out.println(f2.pro); //protected
		 
		 //default => ������Ű���ϰ�� ������ �������� ����, �ٸ���Ű���� ���� ������ �Ұ�
		 System.out.println(f2.df);  //default

		 //private => ������ �ش� Ŭ���� �������� �������� ���� 
		 //System.out.println(f2.pri); //xxx is not visible
		

	}

}
