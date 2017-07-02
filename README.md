# AOP 기본 개념 & 원리

* [1. AOP기본:spring_9_2_ex1_springex](#AOP)

<hr/>

<br/>
<br/>

# AOP
> 프로그래밍을 하다 보면, 공통적인 기능이 많이 발생 한다. 이러한 공통 기능을 모든 모듈에 적용하기 위한 방법으로 상속을 통한 방법이 있다.
  상속도 좋은 방법이기는 하지만 몇 가지 문제가 있다.우선 JAVA에서는 다중 상속이 불가하므로 다양한 모듈에 상속기법을 통한 공통 기능 부여는 한계가 있다.
  그리고, 기능 구현부분에 핵심 기능 코드와 공통 기능 코드가 섞여 있어 효율성이 떨어진다.
- 위의 상속을 통한 방법에 한계가 있어 AOP가 등장
- AOP방법은 핵심 기능과 공통 기능을 분리 시켜놓고, 공통 기능을 필요로 하는 핵심 기능들에서 사용하는 방식.



<br/>

## AOP 원리
## ![사진](https://github.com/leedongjoon121/SpringFramework_study/blob/lecture11/document_img/theory1.PNG?raw=true)

