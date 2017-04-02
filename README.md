# 스터디 내용

## 스프링 컨테이너 생명주기
1. 스프링 컨테이너 생성
- GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();	// 컨테이너 생성 -> 객체 생성

2. 스프링 컨테이너 설정
- ctx.load("classpath:applicationCTX.xml");	// xml 파일 로드 -> 컨테이너 설정 부분
- ctx.refresh(); // 디폴트 생성자로 컨테이너를 생성한 경우, 반드시 refresh를 해줘야 한다.

3. 스프링 컨테이너 사용
- Student student = ctx.getBean("student", Student.class);	// 컨테이너 사용 단계

4. 스프링 컨테이너 종료
- ctx.close();  // 컨테이너 종료 단계

<br/>

## 스프링 빈 생명주기 
> 인터페이스를 이용 or 애너테이션을 이용

<br/>

1. 인터페이스 이용
> 1_1. InitializingBean 이라는 인터페이스 <br/>
  Bean이 초기화되는 시점에, 반드시 afterPropertiesSet() 이라는 메서드를 오버라이드 하게 되어 있음 <br/>
     ctx.refresh()  : 이때 생성이됨, bean이 초기화 되야 생성됨 <br/>
     
2. 애너테이션 이용
