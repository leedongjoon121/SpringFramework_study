package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect // 이클래스가 Aspect의 역할을 할 것임을 명시, xml방식 보다 편리하다. 공통 클래스에 넣어주기만 하면 됨
public class LogAop {
	
	@Pointcut("within(com.javalec.ex.*)") // pointcut 메서드 , 핵심 범위의 어느 범주 까지 공통 기능을 적용 할지 
	private void pointcutMethod() {
	} // 메서드 안에 굳이 내용 없어도 됨
	
	
	@Around("pointcutMethod()") // 공통 기능에 바로 around 적용하고,위의 pointcut 메서드 이름 
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println( signatureStr + " is start.");
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinpoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println( signatureStr + " is finished.");
			System.out.println( signatureStr + " 경과시간 : " + (et - st));
		}
		
	}
	
	@Before("within(com.javalec.ex.*)") // pointcut을 이용하지 않고, 바로 어드바이스를 주고, 안에 expression 값을 넣어도 됨
	public void beforAdvice() { // 핵심 기능이 실행되기 전 한번 
		System.out.println("beforAdvice()");
	}
	
}
