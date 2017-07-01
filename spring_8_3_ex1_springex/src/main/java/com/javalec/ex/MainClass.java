package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	 // 프로파일을 이용한 설정
	 // 각각 상황에 맞는 스프링 빈을 만들어 놓고, 상황별로 다르게 셋팅을 할 수 있는 장점이 있다.
	public static void main(String[] args) {
		
		String config = null;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next(); 
		if(str.equals("dev")) {  
			config = "dev";  // 개발환경 이라고 가정
		} else if(str.equals("run")) { 
			config = "run";  // 실행 환경 이라고 가정 
		}else{
			System.out.println("dev나 run 중에 하나로 입력 하세요");
		}
		
		scanner.close();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // xml 설정 파일
		
		// ☆★☆★☆★☆★☆★☆★ 프로파일 핵심 .. !! ☆★☆★☆★☆★☆★☆★
		ctx.getEnvironment().setActiveProfiles(config); // Scanner로 입력 받은 값에 따라 다르게함, 현재 황성화 되어 있는 프로파일로 셋팅을 한다.
		ctx.load("applicationCTX_dev.xml", "applicationCTX_run.xml"); // 둘중에 하나 이용
		
		
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("ip : " + info.getIpNum());
		System.out.println("port : " + info.getPortNum());
		ctx.close();
		
	}
	
}
