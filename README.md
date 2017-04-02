# 스터디 내용
## xml 파일을 이용하는 방식이 아닌 @애너테이션 방식을 이용함

<br/>

## ApplicationConfig.java

- 애너테이션 기법을 사용하며, 클래스파일 위에 반드시 @Configuration을 명시해 준다.
- 총 두개의 Bean 객체가 된다.
- 생성자를 통해 매핑 하는방식 : Student student = new Student("First_Bean_홍길동", 20, hobbys);
- Property를 이용하여 Setter메서드를 이용하는 방식 : student.setHeight(180);    student.setWeight(80);

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture5/img/applicationconfig1.JPG?raw=true)

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture5/img/applicationconfig2.JPG?raw=true)
<br/>

## Student클래스
- 이름&나이&취미는 생성자로, 키&몸무게는 Property Setter메서드로 매핑.

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture5/img/Student.JPG?raw=true)

<br/>

## Main 클래스
- AnnotationConfigApplicationContext를 사용한다. 그러나 내부적으로  xml로 변경되어 사용 된다.
- AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
- 해당 환경 설정은 ApplicationConfig.class 에서 매핑 된다.
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture5/img/Mainclass.JPG?raw=true)

<br/>

## Result

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture5/img/Result.JPG?raw=true)
