# 외부파일을 이용한 설정

* [1. 에너테이션방식:spring_8_2_ex2_springex](#에너테이션방식)
* [2. 프로파일방식(xml):spring_8_3_ex1_springex](#프로파일방식1)
* [3. 프로파일방식(java):spring_8_3_ex2_springex](#프로파일방식2)

<hr/>

<br/>
<br/>

# 에너테이션방식
- 에너테이션방식(클래스)
- 외부 파일을 이용한 방식

<br/>

## Main.java 
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/MainClass_java.PNG?raw=true)


<br/>

## ApplicationConfig.java 
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/ApplicationConfig1_java.PNG?raw=true)

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/ApplicationConfig2_java.PNG?raw=true)



<br/>

## AdminConnection.java
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/AdminConnection_java.PNG?raw=true)

<br/>

## sub_admin_properties.java
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/sub_admin_properties.PNG?raw=true)

<br/>

## admin_properties.java
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/admin_properties.PNG?raw=true)

<br/>

## Result
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/result.PNG?raw=true)


<br/>
<br/>

# 프로파일방식1
- 프로파일(profile) 속성을 이용한 설정
- 동일한 스프링 빈을 여러개 만들어 놓고 상황(환경)에 따라서 적절한 스프링 빈을 사용할 수 있다.

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/theory.PNG?raw=true)

> 사진출처 : https://www.inflearn.com/course/자바-스프링-강좌/

<br/>

## MainClass
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/8_3-Mainclass.PNG?raw=true)

<br/>

## ServerInfo
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/8_3-ServerInfo.PNG?raw=true)

<br/>

## ApplicationCTX_dev
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/8-3-applicationCTX_dev.PNG?raw=true)

<br/>

## ApplicationCTX_run
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/applicationCTX_run.PNG?raw=true)

<br/>

## Result
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/result.PNG?raw=true)

<br/>


# 프로파일방식2
- xml 방식과 로직은 비슷하며 다만, 에너테이션방식이므로 더 간편하다

<br/>

## MainClass
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/8_3-2-Mainclass.PNG?raw=true)


<br/>

## ApplicationConfigDev
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/8_3-2-ApplicationConfigDev.PNG?raw=true)


<br/>

## ApplicationConfigRun
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture10/img/8_3-2-ApplicationConfigRun.PNG?raw=true)



