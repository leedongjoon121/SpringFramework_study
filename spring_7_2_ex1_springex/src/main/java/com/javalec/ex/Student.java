package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



// 인터페이스를 이용한 스프링 빈 생명주기 컨트롤 !!
public class Student implements InitializingBean, DisposableBean{

	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Bean이 초기화 될때 생성되는 메서드
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student 클래스 빈객체 생성됨 , afterPropertiesSet()메서드 호출");
	}

	// Bean이 소멸되는 과정에서 생성되는 메서드
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student 클래스 빈객체 소멸됨 , destroy()");
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
