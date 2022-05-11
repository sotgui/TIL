## Chrome 개발자 도구

##### 화면단 디버깅 하기

* 이클립스에서는 JSP 디버깅 시 스크립트 부분만 BreakPoint 설정가능

  * 크롬 개발자 도구 `F12` 사용

  * 특히 화면 내 팝업 에서 디버깅할 때 그 부분 찾기가 어려운 경우 있다.

  * Elements에서 해당 파트 찾은 후 Event Listeners에서 click, change 등 이벤트 누르면 해당 부분 소스로 바로 연결 가능

  * 소스에서 클릭하여 BP 걸고 콘솔창에 console.log() 커맨드로 변수 확인!

    