# AOP 기본 개념 & 원리

* [1. AOP기본](#AOP)
* [2. AOP기본용어](#AOP기본용어)
* [3. 예제를 통해 기본원리 파악하기:spring_9_2_ex1_springex](#예제1)
* [4. 예제를 통해 기본원리 파악하기:spring_10_1_ex1_springex](#예제2)

<hr/>

<br/>
<br/>

# AOP

> 프로그래밍을 하다 보면, 공통적인 기능이 많이 발생 한다. 이러한 공통 기능을 모든 모듈에 적용하기 위한 방법으로 상속을 통한 방법이 있다.
  상속도 좋은 방법이기는 하지만 몇 가지 문제가 있다.우선 JAVA에서는 다중 상속이 불가하므로 다양한 모듈에 상속기법을 통한 공통 기능 부여는 한계가 있다.
  그리고, 기능 구현부분에 핵심 기능 코드와 공통 기능 코드가 섞여 있어 효율성이 떨어진다.
- 위의 상속을 통한 방법에 한계가 있어 AOP가 등장
- AOP방법은 핵심 기능과 공통 기능을 분리 시켜놓고, 공통 기능을 필요로 하는 핵심 기능들에서 사용하는 방식.


<br/>

## AOP 원리
- Proxy를 이용하여 로직상의 핵심기능을 매핑시켜준다.
- 1. 실행초반, 실행끝부분, 실행중 exception이 발생했을때 proxy가 끼어든다.
- 스프링에서 AOP 구현 방식으로는 크게 XML스키마 기반, @Aspect 어노테이션 기반의 두가지 방식이있다.
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/theory1.PNG?raw=true)

<br/>

# AOP기본용어
- Aspect : 공통 기능
- Advice : Aspect의 기능 자체- Aspect의 세부적인 내용 (핵심)
- Jointpoint : Advice를 적용해야 되는 부분( ex, 필드, 메소드 ) (스프링에서는 메소드만 해당)
- Pointcut : Jointpoint의 부분으로 실제로 Advice가 적용된 부분
- Weaving : Advice를 핵심 기능에 적용 하는 행위

<br/>

# 예제1
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/theory_AOP2.PNG?raw=true)

<br/>

# Main
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/main.PNG?raw=true)


<br/>

# LogAop 
- 공통으로 사용되는 핵심 클래스
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/LogAop.PNG?raw=true)

<br/>

# Student.java
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/Student.PNG?raw=true)

<br/>

# Worker.java
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/Worker.PNG?raw=true)

<br/>

# applicationCTX.xml
- aop 설정부분, 공통으로 사용할 부분에 대한 기능 구현
- Student 빈과 Worker 빈 두군데에서 사용
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/applicationCTX_xml.PNG?raw=true)

<br/>

# pom.xml
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/pom_xml.PNG?raw=true)

<br/>

# Result
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/result.PNG?raw=true)


<br/>

# Advice종류
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/theory_AOP3.PNG?raw=true)

<br/>

# 예제2
# @Aspect를 이용한 AOP구현
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/10-1_theory.PNG?raw=true)


<br/>

# Main
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/10-1_main.PNG?raw=true)


<br/>

# LogAop
- @Aspect 라고 명시를 해주면 applicationCTX에서 <aop:aspectj-autoproxy /> 를 통해 자동으로 찾아줌
- Pointcut을 사용하여 Around를 적용하는 방식과 pointcut을 이용하지않고 Before를 이용해 핵심기능 실행전 수행되게 할수도 있다.
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/10-1_LogAop.PNG?raw=true)


<br/>

# applicationCTX
- <aop:aspectj-autoproxy />를 통해 대행자를 자동으로 생성하며 LogAop클래스의 @Aspect를 자동으로 찾아가서 실행 시켜줌
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/10-1_applicationCTX.PNG?raw=true)


