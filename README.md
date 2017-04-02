# 스터디 내용
## xml 파일을 이용하는 방식이 아닌 @애너테이션 방식을 이용함

<br/>
## ApplicationConfig.java
- 애너테이션 기법을 사용하며, 클래스파일 위에 반드시 @Configuration을 명시해 준다.
- 총 두개의 Bean 객체가 된다.
- 생성자를 통해 매핑 하는방식 : Student student = new Student("First_Bean_홍길동", 20, hobbys);
- Property를 이용하여 Setter메서드를 이용하는 방식 : student.setHeight(180);    student.setWeight(80);
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture5/img/applicationconfig1.JPG?raw=true)
