package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.load("classpath:applicationCTX.xml");
		
		ctx.refresh();
		
		Dongjoon dongjoon = ctx.getBean("Dongjoon",Dongjoon.class);
		System.out.println("나의 이름은 : "+dongjoon.getName());
		System.out.println("내가 하고 싶은 말은 :"+dongjoon.getMsg1()+dongjoon.getMsg2());
		System.out.println("학번은 : "+dongjoon.getStudentNum());
		ctx.close();
		
	}
	
}
