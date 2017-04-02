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

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture6/img/Main.JPG?raw=true)

<br/>

## 스프링 빈 생명주기 
- 인터페이스를 이용 or 애너테이션을 이용

<br/>

1. 인터페이스 이용
> InitializingBean 인터페이스 사용 <br/>
  Bean이 초기화되는 시점에, 반드시 afterPropertiesSet() 이라는 메서드를 오버라이드 하게 되어 있음 <br/>
     ctx.refresh()  : 이때 생성이됨, bean이 초기화 되야 생성됨 <br/>

> DisposableBean 인터페이스 사용 <br/>
  Bean이 소멸되는 과정에 destroy() 라는 메서드를 오버라이드 <br/>
  ctx.close()  : 자원이 소멸 됨 <br/>
  컨테이너가 소멸되는 과정으로써, 컨테이너가 소멸되면 Bean도 자동 소멸됨 <br/>
  컨테이너는 살려두고 Bean만 소멸 시키고자 한다면 xxx.destroy() 메서드 사용하면 됨 <br/>

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture6/img/Student.JPG?raw=true)

<br/>

2. 애너테이션 이용
> @PostConstruct <br/>
  만약 빈이 생성될때 무엇인가 하고 싶으면 @PostConstruct 이것만 붙이면 된다. 메서드 이름은 상관 없음 <br/>

> @PreDestroy <br/>
  만약 빈이 소멸될때 무엇인가 하고 싶으면 @PreDestroy 이것만 붙이면 된다. 메서드 이름은 상관 없음 <br/>
  
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture6/img/Otherstudent.JPG?raw=true)
  
<br/>

## Dongjoon 클래스
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture6/img/Dongjoon.JPG?raw=true)

<br/>

## applicationCTX 클래스
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture6/img/applicationCTX.JPG?raw=true)

<br/>

## Result 
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture6/img/result.JPG?raw=true)

