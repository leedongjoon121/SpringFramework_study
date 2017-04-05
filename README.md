# 스터디 내용
## 외부 파일을 이용한 설정
## 1. Environment 객체를 사용 하는 방법
- 1. Context 파일을 만든다.  - ctx.getEnvironment() 를 한다.
- 2. Environment 객체 생성 - env.getPropertySources()   <br/>
  property 들이 위치 하게 됨 -> 이 프로퍼티 들의 소스들을 전부 가져옴 
- 3. PropertySources 객체 구함         <br/>
  프로퍼티 추가 : propertySources.addLast()  <br/>
  프로퍼티 추출 : env.getProperty()
  
  <br/>
  
## applicationCTX 
- 외부 파일을 가져오는 방식 : context:property-placeholder location

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture7/img/applicationCTX.JPG?raw=true)

<br/>

## AdminConnection
- ID & PW를 반환
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture7/img/AdminConnection.JPG?raw=true)

<br/>

## Main 
- 기존 방식과 동일

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture7/img/MainClass.JPG?raw=true)

<br/>

## admin.properties

## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture7/img/admin_properties.JPG?raw=true)

<br/>

## 2. 프로퍼티 파일을 이용한 설정 
- Environment 객체를 사용하지 않고 프로퍼티 파일을 직접 이용하여 스프링 빈을 설정

