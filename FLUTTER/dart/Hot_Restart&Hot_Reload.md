
- Kotlin, Java, C#,&nbsp; Swift 등의 네이티브 코드변경
  핫 리로드, 핫 리스타트는 개발중인 프로젝트 앱을 실행하고 변경되는 사항을 빠르게 반영하기 위해 지원하는 기능이다.

이 둘의 가장 큰 차이점은 빌드유무에 있다.



# 1. Hot Reload
Dart VM에 변경된 코드를 불러오고 위젯트리를 재빌드한다.

앱의 상태를 보전하기 때문에,  main(), initState()를 재실행하지 않는다.



# 2. Hot Restart
Dart VM에 변경된 코드를 불러오고 앱을 재시작한다.

앱의 모든 상태를 잃어버리고, 새로 시작하므로 main() 부터 호출된다.



#3. 사용
Relaod 로 가능할 때

- 새로운 라이브러리의 사용 및 변경

- 위젯의 구조변경 및 수정

- image나 assets파일의 추가사용



Restart 를 해야할 때

- initState 메서드상에 변경

- 폰트의 변경이나 추가

- 제너릭과 열거형 클래스의 추가

- Kotlin, Java, C#,  Swift 등의 네이티브 코드변경

- 그 외에 앱 상태에 변경을 주는 코드 수정시



# 4. Full Restart
   몇몇 특정 상황들에서는 Hot Restart로 수정사항이 앱에 반영되지 않을 수 있습니다.

- Kotlin, Java, C#,  Swift 등의 네이티브 코드변경

- 앱의 종료 


![](https://blog.kakaocdn.net/dn/RlZGH/btrBiHRNNUb/0kXVRHYidtBPK7lcm3cMZ1/img.png)