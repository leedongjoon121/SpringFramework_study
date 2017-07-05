# Spring 데이터 전송 기본

* [1. HttpServletRequest방식](#HttpServletRequest)
* [2. RequestParam방식](#RequestParam)
* [3. 데이터(커멘드)객체방식](#DataObject)

<hr/>

<br/>
<br/>


# HttpServletRequest

- HttpServletRequest로 부터 url를 통한 값을 가져오고
- Model 객체에 데이터를 전송하는 방식
- url로 부터 값이 넘어오지 않아도 페이지가 넘어가긴 한다.

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture14/document_img/theory_httpserveltRequest.PNG?raw=true)


<br/>

# RequestParam

- url로 부터 넘어오는 값을 미리 할당해 놓고 그 값을 Model객체로 전송하는 방식
- url로 부터 값이 넘어오지 않으면 에러발생

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture14/document_img/theory_RequestParam.PNG?raw=true)


<br/>

# DataObject
- 실무에서 많이 사용되는 방식
- 데이터 객체를 이용하여 데이터가 많을 경우 간단하게 사용가능
- HttpServletRequest나 RequestParam처럼 객체 하나 하나 할당해 줄 필요없이 
- 스프링에서 자동으로 넘어온 값을 알아서 매핑 해준다.

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture14/document_img/theory_DataCommand.PNG?raw=true)


<br/>
## ![사진](?raw=true)
-

<br/>
## ![사진](?raw=true)
-

<br/>
## ![사진](?raw=true)
-
