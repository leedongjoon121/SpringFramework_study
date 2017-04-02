package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.load("classpath:applicationCTX.xml");
		
		ctx.refresh();
		
		Dongjoon dongjoon = ctx.getBean("Dongjoon",Dongjoon.class);
		System.out.println("���� �̸��� : "+dongjoon.getName());
		System.out.println("���� �ϰ� ���� ���� :"+dongjoon.getMsg1()+dongjoon.getMsg2());
		System.out.println("�й��� : "+dongjoon.getStudentNum());
		ctx.close();
		
	}
	
}
