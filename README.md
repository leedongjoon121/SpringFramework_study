# 스프링 MVC_Controller
> 스프링 MVC중 Controller 학습


<hr/>

<br/>
<br/>


  
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

#
## ![사진](?raw=true)


<br/>

#
## ![사진](?raw=true)


<br/>

#
## ![사진](?raw=true)


<br/>

#
## ![사진](?raw=true)
