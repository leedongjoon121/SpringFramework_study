# 스터디 내용
## 1. Environment 객체를 사용 하는 방법
- 1. Context 파일을 만든다.  - ctx.getEnvironment() 를 한다.
- 2. Environment 객체 생성 - env.getPropertySources()   <br/>
  property 들이 위치 하게 됨 -> 이 프로퍼티 들의 소스들을 전부 가져옴 
- 3. PropertySources 객체 구함         <br/>
  프로퍼티 추가 : propertySources.addLast()  <br/>
  프로퍼티 추출 : env.getProperty()
  
<br/>

## Main 
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture8/img/Main.JPG?raw=true)

<br/>

## AdminConnection
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture8/img/AdminConnection.JPG?raw=true)

<br/>

## admin.properties
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture8/img/admin_properties.JPG?raw=true)

<br/>

## applicationCTX
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture8/img/applicationCTX.JPG?raw=true)

<br/>

## Result
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture8/img/Result.JPG?raw=true)

<br/>
