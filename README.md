# 스프링 MVC_Controller
> 스프링 MVC중 Controller 학습


<hr/>

<br/>
<br/>

<br/>

# 컨트롤러 클래스 제작 순서
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture13/document_img/theory_controller.PNG?raw=true)


<br/>

# 프로젝트 디렉터리 (view)
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture13/document_img/directory.PNG?raw=true)



<br/>

# 클라이언트 요청처리 @RequestMapping
- 요청경로와 해당하는 뷰페이지 이름 : String을 리턴 
- 뷰페이지의 이름은 prefix (/WEB-INF/views) + 리턴된 String value + suffix(.jsp)

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture13/document_img/theory_1.PNG?raw=true)

<br/>

# Controller -> Model -> View 로 데이터 전달
- Model 객체를 파라미터로 받아서 Attribute를 추가 하여 View에서 확인
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture13/document_img/theory_2.PNG?raw=true)


<br/>

# Controller -> Model -> View 로 데이터 전달2
- Model 객체를 파라미터로 받지않고, ModelAndView 객체를 생성하여
- 직접 Model객체에 데이터를 넣는다.
- 이때 Model객체에 뷰이름과 Object를 추가하여 View로 전달
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture13/document_img/theory_3.PNG?raw=true)


<br/>

# 클래스에 @RequestMapping 적용
- 보통 메서드에 @RequestMapping 어노테이션을 적용하지만, 클래스에 적용할 수도있따
- 클래스 부터 적용하고 -> 클래스 내부 메서드에 적용하면, 조합된 경로로(클래스+메서드) 매핑된다.

## ![사진](?raw=true).




<br/>

# HomeController.java
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture13/document_img/HomeController.PNG?raw=true)


