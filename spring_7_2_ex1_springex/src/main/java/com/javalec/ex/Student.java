package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



// �������̽��� �̿��� ������ �� �����ֱ� ��Ʈ�� !!
public class Student implements InitializingBean, DisposableBean{

	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Bean�� �ʱ�ȭ �ɶ� �����Ǵ� �޼���
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student Ŭ���� ��ü ������ , afterPropertiesSet()�޼��� ȣ��");
	}

	// Bean�� �Ҹ�Ǵ� �������� �����Ǵ� �޼���
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student Ŭ���� ��ü �Ҹ�� , destroy()");
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
