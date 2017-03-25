# 이번 강좌 주요 내용.

## Main 클래스. MyInfo 클래스로부터 전달받음.
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture3/img/Main.JPG?raw=true)
<br/>

## Myinfo 클래스 이름, 키, 몸무게, 비만도 지수를 Main클래스로 전달하며, 비만도지수는 BMICalucator로부터 전달 받음, 신체 정보는 applicationCTM.xml 파일로부터 주입 받음
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture3/img/Myinfo.JPG?raw=true)
<br/>

## BMICalculator 클래스, 키와몸무계를 바탕으로 비만도 계산, 신체 정보는 applicationCTM.xml 파일로부터 주입 받음
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture3/img/BMICal.JPG?raw=true)
<br/>

## applicationCTM.xml 파일 BMICalculator의 비만도 측정 기준안 value값을 가지고 있으며, BMICalculator클래스에게 value 전달.
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture3/img/xml_1.JPG?raw=true)
<br/>

## applicationCTM.xml 파일 MyInfo 클래스에 나의 신체지수 Data를 전달하여 주입시킴
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture3/img/xml_2.JPG?raw=true)
<br/>

## 결과값 :     .. 저체중이 나왔다..... 운동을 하여 근육량을 키워야 겠다...
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture3/img/result.JPG?raw=true)
<br/>
