package com.kh.chap05_constructor.model.vo;

public class User {

	//�ʵ��
	private String userId; //������� ���̵�
	private String userPwd; //������� ��й�ȣ
	private String userName; //������� �̸�
	private int age; //������� ����
	private char gender; //������� ����
	
	//�����ں�
	/*
	 * *������
	 * �̸��� Ŭ������� ���� ���� �ڷ���(��ȯ��)�� ���� ������ �޼ҵ�(�����ڷ��� ������)
	 * ��ü�� ����( new Ŭ������(); )�ɶ� ȣ��Ǵ� �޼ҵ�
	 * �⺻������ �Ű������� ���� �⺻ ������ �����ڸ� JVM �� ������ش�. 
	 * 
	 * [ ǥ���� ]  (��ȯ��)   �޼ҵ��
	 *  //public (�����ڷ���) Ŭ������() {
	 *  
	 /* public  Ŭ������(�Ű�����=> ��������) {
	 *        �������ڵ�;    
	 *  }
	 * �����ڸ� �ۼ��ϴ� ����
	 * 1. ��ü�� �����ϱ� ����
	 * 2. ��ü�� ������ �Ӹ� �ƴ϶� �Ű������� ���޵� ���� ��ٷ� �ʵ忡 �ʱ�ȭ�� ����
	 *    (����=> �迭���� ����� ���ÿ� ���� ���ϴ� ������ �ʱ�ȭ�ߴ� �� ���̺���!)
	 * 
	 * �����ڸ� �ۼ��� �� ��������
	 * 1. �������� �̸��� �ݵ�� Ŭ������� �����ؾ���(��ҹ��ڱ��� Ȯ����! �侾�ϳ� ��Ʋ����)
	 * 2. ��ȯ���� �ۼ����� �ʴ´�. (�޼ҵ�� �����ϰ� ���ܼ� �򰥸� �� ����)
	 * 3. ���� �̸����� ������ �ۼ��� ����, �� , �Ű������� �ߺ����� �ʴ� ��쿡�� �ߺ��ۼ� ����
	 * 4. �Ű������� �ִ� �����ڸ� ��������� �ۼ��ϰ� �Ǹ� �⺻�����ڸ� JVM�� �ڵ����� ��������� ����!(�߿��� Ư¡)
	 * 
	 *  ��, ����Ǿ��� ���� �⺻�����ڴ� �׻� ����� ������ ������!
	 */
	//public Ŭ������(�Ű�����) {
	   public User() {
		  
		  // �⺻ ������ : �Ű������� ���� ������
		  // => ���� ��ü�� ������ �������� �ۼ��Ѵ�.  (new �����ڸ� �̿��Ͽ� ȣ����Ҷ� heap ������ �Ҵ��ϰڴ�.����Ȯ��) 
		  // ���� ������´�. 
		  // �⺻�����ڸ� �����ϴ� ���=> ������ ���� ����
		  // JVM �� �ڵ����� �⺻�����ڸ� �������� ������ �׻� ��ü ������ ��������
		  // ��, �Ű������� �ִ� �����ڰ� �߰������� �ۼ��Ǿ����� ���
		  // �⺻�����ڸ� JVM�� �ڵ����� ��������� �ʱ� ������ 
		  // �� ��쿡�� �⺻�����ڸ� �ݵ�� �ۼ������ �Ѵ�.
		  //=> �׻� �⺻�����ڴ� ������! 
		   
		 // System.out.println("�� ȣ�� �ǳ�..?");
		  
	}
	
	  //�Ű������� �ϳ��� �ٸ��� ��- ���� �ȶ�
	 public User( String userId, String userPwd, String userName ) {
		 
		 this.userId = userId;
		 this.userPwd = userPwd;
		 this.userName = userName;
		 
	 }

	 public User (String userId, String userPwd, String userName ,int age, char gender ) {
		 
		 // ��� �ʵ忡 ���ؼ� �Ű������� �����ִ� ������ : �ʵ尡 5���� �Ű������� 5����.
		 // => ��ü�� �����ϰ� �� ���� ���� ���ϴ� ������ �ʱ�ȭ���� ��ų ����
		 // �׻� ����� ������ �ʼ��� �ƴϳ�, �׷��� ����� �� ����!
		 
		 /*
		 this.userId = userId;
		 this.userPwd = userPwd;
		 this.userName = userName;
		 */
		 this(userId, userPwd, userName);
		 // ���� ���� �ߺ��Ǵ� ������ �ʱ�ȭ �ϴ� ������ �����ڰ� �̹� ������ ���
		 // this ��� �����ڸ� ȣ�� ����
		 // this ������ : ���� Ŭ���� ���� �ٸ� �����ڸ� ȣ���ϴ� ����
		 // ��, ���ǻ����� �ݵ�� ������ ���� ���� ���ٿ� �ۼ��ؾ� �Ѵ�! 
		 
		 this.age = age;
		 this.gender = gender;
		 
	 }

	
	//�޼ҵ��
	//setter
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd= userPwd;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	//getter
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	//information
	public String information() {
		return "���̵�: "+userId+", ��й�ȣ: "+userPwd+", �̸�: "+userName+
				", ���� : "+age+ ", ����: "+gender;
	}
	
	
	
	
	
}
