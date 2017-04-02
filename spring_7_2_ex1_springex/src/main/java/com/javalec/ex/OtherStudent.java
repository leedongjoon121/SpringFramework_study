package com.javalec.ex;

import javax.annotation.*;

public class OtherStudent  {

	private String name;
	private int age;
	
	public OtherStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	// �ֳ����̼��� �̿��� ������ �� �����ֱ� ��Ʈ�� !
	// ���� ���� �����ɶ� �����ΰ� �ϰ� ������ @PostConstruct �̰͸� ���̸� �ȴ�. �޼��� �̸��� ��� ����  
	@PostConstruct
	public void initMethod() {
		System.out.println("OtherStudentŬ���� �� ��ü ������ , @PostConstruct, initMethod() ȣ��!!");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("OtherStudentŬ���� �� ��ü �Ҹ�� , @PreDestroy, destroyMethod() ȣ�� !!");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
