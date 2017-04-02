package com.javalec.ex;

import javax.annotation.*;

public class OtherStudent  {

	private String name;
	private int age;
	
	public OtherStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	// 애너테이션을 이용해 스프링 빈 생명주기 컨트롤 !
	// 만약 빈이 생성될때 무엇인가 하고 싶으면 @PostConstruct 이것만 붙이면 된다. 메서드 이름은 상관 없음  
	@PostConstruct
	public void initMethod() {
		System.out.println("OtherStudent클래스 빈 객체 생성됨 , @PostConstruct, initMethod() 호출!!");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("OtherStudent클래스 빈 객체 소멸됨 , @PreDestroy, destroyMethod() 호출 !!");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
