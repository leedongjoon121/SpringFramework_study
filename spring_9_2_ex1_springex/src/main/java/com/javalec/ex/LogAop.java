package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
   
	// 공통 기능으로 사용할 클래스 : loggerAop
	
	// JoinPoint : 핵심 기능들
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString(); // 로그 찍어봄(이름)
		System.out.println( signatureStr + " is start.");
		long st = System.currentTimeMillis(); // 메서드 시작 시간
		
		try {
			Object obj = joinpoint.proceed(); // 핵심 기능 시작 !
			return obj;
		} finally { // 핵심 코드의 기능이 다끝난 후 
			long et = System.currentTimeMillis(); // 시스템 시작 시간 측정
			System.out.println( signatureStr + " is finished.");
			System.out.println( signatureStr + " 경과시간 : " + (et - st));
		}
		 // 즉 핵심 기능 JoinPoint 의 로직 실행 시간을 측정함 
	}  // 스프링 설정 파일에서 loggerAop 를 bean으로 만들어야 함
	
}
