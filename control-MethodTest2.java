package com.kh.chap06_method.controller;

public class MethodTest2 {

	// static �޼ҵ��� ��쿡�� ȣ�� �� new �������� ��ü�� ������ �ʿ䰡 ����
	public static void method1() {
		
		System.out.println("�Ű������� ���� ��ȯ���� ���� static �޼ҵ� ");
				
	}
	public static String method2() {
		
		return "�Ű������� ������ ��ȯ���� �ִ� static �޼ҵ�";
		
	}
	public static void method3(String name, int age) {
		
		//xx ���� xxx�� ȯ���մϴ�^^
		System.out.printf("%d���� %s�� ȯ���մϴ�^^ \n",age,name);	
	}
    public static int method4( int num1, int num2,char op) {
    	
    	int result=0;
    	
    	switch(op){
    	case '+' : result= num1+num2 ; break;
    	case '-' : result= num1-num2; break;
    	case '*' : result= num1*num2; break;
    	case '/' : result= num1/num2; break;
    	case '%' : result= num1%num2; break;
    	default : result= -99999; 	

    	}    	
    	//return result;   //��ȯ�� int�� return �� ����� int�̶� ���ƾ� �Ѵ�. 
    	return "����ϱ� ������?";  
	
    }
	
	
}
