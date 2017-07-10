##  스프링 프레임워크 스터디

- 본 스터디 내용은 SEOUL WIZ의 Kim Myoung-ho (Nickname :블스)님의 강좌 내용에 대한것 입니다.
- 강의 주소 : https://www.inflearn.com/course/자바-스프링-강좌/
- 스터디의 내용을 각 단계별 branch에 업로드 하였습니다.
- 각 branch 와 master 상관이 없습니다. 별도의 내용을 정리한 저장소입니다.

<br/>

<hr/>

# SpringFramework Simple SNS

- DB : oracle
- Server : Tomcat 7.0
- Oracle JDBC driver 

* [1. Project구조](#Project구조)
* [2. 프로젝트디렉터리](#프로젝트디렉터리)
* [3. 환경설정](#환경설정)
* [4. Code](#Code)
* [5. AspectJ Pointcut 표현식](#표현식)


<hr/>

<br/>
<br/>

# Project구조

> 클라이언트로 부터 요청이오면 Dispatcher가 해당 요청을 MainController에게 넘기고 MainController는 각각의 세부적인
  컨트롤러에 명령을 할당 DAO를 통해 글쓰기,내용확인,수정,삭제,댓글 등의 기능을 수행하기 위한 DB Connection 및 SQL 쿼리문을 전송
   
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/architecture.PNG?raw=true)

<br/>

# 프로젝트디렉터리
- Controller 및 DAO, DTO, 각종 view로 구성

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/directory1.PNG?raw=true)

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/directory2.PNG?raw=true)

<br/>

# 환경설정
## pom.xml
- 오라클 JDBC 드라이버를 가져오기 위해 리포지토리를 추가 및, 오라클 jdbc드라이버 dependency 추가

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/pom_xml.PNG?raw=true)

<br/>

## Server : context.xml
- Oracle DB와 연동하기 위해 Resource 추가

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/server_context_xml.png?raw=true)

<br/>

# Code
## DTO
- 데이터 구조 셋팅, 각종 getter,setter 메서드

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/DTO.PNG?raw=true)

<br/>


## DTO
- 데이터 구조 셋팅, 각종 getter,setter 메서드

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/DTO.PNG?raw=true)

<br/>


## DAO
- Oracle DB Connection 설정
- 각종 글쓰기, 수정, 삭제, 댓글 등의 해당 메서드
- 각종 sql 쿼리문

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/DAO.PNG?raw=true)

<br/>


## MainController
- @RequestMapping을 통해 url 매핑
- 각종 Command 객체 구현 및 Model 구현 (request 활용)   

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/controller.PNG?raw=true)

<br/>

## ListCommand
- 글의 List를 모두 보여주는 Command

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/List_command.PNG?raw=true)


<br/>

## WriteCommnad
- 글을 작성하는 Command

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/master/document_img/write_command.PNG?raw=true)


<br/>

## 

## ![사진](?raw=true)


<br/>

## 

## ![사진](?raw=true)
