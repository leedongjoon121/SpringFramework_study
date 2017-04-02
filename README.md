# 이번 강좌내용
## apllicationCTX.xml 파일을 두개를 만들어 각각 매핑시켜 사용한다.

<br/>

## Main 클래스1 
- config 파일이 두개이기 때문에 configLocation1,2를 설정하고,
- new GenericXmlApplicationContext(configLocation1, configLocation2); 처럼 두개의 config파일을 매핑

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture4/img/main1.JPG?raw=true)

<br/>
  
## Main 클래스2
- 해당하는 bean객체의 값이 출력됨
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture4/img/main2.JPG?raw=true)

<br/>

## applicationCTX.xml
- Student클래스로부터 student1 빈객체 생성,  StudentInfo 클래스로 부터 studentInfo1 빈 객체 생성,
- 이때, studentInfo1객체는 student1 객체로부터 참조하여 생성된다
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture4/img/applicationCTX.JPG?raw=true)

<br/>

## applicationCTX1.xml
- 평소 bean객체를 생성하는 방식 말고도 네임스페이스를 이용하여 bean 객체를 생성할 수있다.
- c:papaName="홍아빠" c:mamiName="홈엄마" p:sisterName="홍누나"를 생성하였으며,
- c의 의미는 constructor(생성자)를 의미하며, p의 의미는 property(setter메서드를 통해 생성)를 의미한다.
- 단, 네임스페이스를 사용하고자 할때는 
> xmlns:c="http://www.springframework.org/schema/c"
>	xmlns:p="http://www.springframework.org/schema/p"
- 위와  설정을 xml파일에 명시해 주어야 한다.
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture4/img/applicationCTX1.JPG?raw=true)
