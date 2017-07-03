# 스프링 MVC

* [1. MVC구조](#MVC구조)

<hr/>

<br/>
<br/>

# MVC전체구조 & 내부 동작 순서
#### 1. 클라이언트의 요청을 Dispatcher가 받고
#### 2. Dispatcher가 받은 요청을 컨트롤러에 넘긴다.
#### 3. servlet-context.xml에서 스캔을 한다. 스캔을 하는데 @Controller 를 찾아서 그 파일이 컨트롤러 파일이라고 처리한다.
#### 4. 그 컨트롤러 파일 내부의 @Request 매핑 부분에 따라 로직을 수행
#### 5. 반환 값으로 던져주는 String 이름을 가지고 view 파일을 찾는다
#### 6. 찾을때도 servlet-context에 있는 prefix와 suffix에 따라서 매핑
#### 7. 해당하는 jsp 뷰를 실행 시킨다.
  
<br/>

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture12/document_img/theory_MVC.PNG?raw=true)

<br/>

# Controller
- Dispatcher가 넘긴 클라이언트의 요청을 수행
- Request 매핑을 통해 내부 로직을 수행
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture12/document_img/HomeController_java.PNG?raw=true)


<br/>

# Controller
## ![사진](?raw=true)


<br/>

# Controller
## ![사진](?raw=true)


<br/>

# Controller
## ![사진](?raw=true)


<br/>

# Controller
## ![사진](?raw=true)

