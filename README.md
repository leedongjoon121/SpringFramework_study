#  스프링 프레임워크 스터디
### 본 스터디 내용은 SEOUL WIZ의 Kim Myoung-ho (Nickname :블스)님의 강좌 내용에 대한것 입니다.
### 강의 주소 : https://www.inflearn.com/course/자바-스프링-강좌/
### 스터디의 내용을 각 단계별 branch에 업로드 하였습니다.
### 각 branch 와 master 상관이 없습니다. 별도의 내용을 정리한 저장소입니다.

<br/>

<hr/>

# SpringFramework Simple SNS

- DB : oracle
- Server : Tomcat 7.0
- Oracle JDBC driver 

* [1. Project구조](#Project구조)
* [2. AOP기본용어](#AOP기본용어)
* [3. 예제를 통해 기본원리 파악하기_Xml기반 : spring_9_2_ex1_springex](#예제1)
* [4. 예제를 통해 기본원리 파악하기_@Aspect방식이용 : spring_10_1_ex1_springex](#예제2)
* [5. AspectJ Pointcut 표현식](#표현식)


<hr/>

<br/>
<br/>

# Project구조

> 클라이언트로 부터 요청이오면 Dispatcher가 해당 요청을 MainController에게 넘기고 MainController는 각각의 세부적인
  컨트롤러에 명령을 할당 DAO를 통해 글쓰기,내용확인,수정,삭제,댓글 등의 기능을 수행하기 위한 DB Connection 및 SQL 쿼리문을 전송
   
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/architecture.PNG?raw=true)

<br/>

## AOP 원리
- Proxy를 이용하여 로직상의 핵심기능을 매핑시켜준다.
- 1. 실행초반, 실행끝부분, 실행중 exception이 발생했을때 proxy가 끼어든다.
