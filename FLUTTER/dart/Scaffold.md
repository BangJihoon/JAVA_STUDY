

### [Scaffold](https://api.flutter.dev/flutter/material/Scaffold-class.html)

스캐폴드는 발판, 배개 라는 뜻,

주로 AppBar, BottomNavigationBar , FloationButton 등을 연결하는 속성이 존재하여

앱의 최상위에서 주로 사용하여 전역적인 UI Layout을 구성하는데 사용함.



#### 1) AppBar

앱의 최상단에 노출되는 위젯으로 Title과 다양한 Button을 넣을 수 있습니다.
Android 에서 TitleBar, iOS에서는 NavigationBar로 불리던 영역 입니다.

#### 2) Body

Scaffold 에 하위 하나의 위젯을 연결하는 속성입니다.

#### 3) BottomNavigationBar

앱의 화면 전환을 이루기 좋은 하단 네비게이션 바 입니다.
Android에선 Bottom Navigation Bar라는 명칭을 그대로 쓰고 있고 iOS에선 Tab Bar로 불리던 영역 입니다

#### 4) FloatingActionButton

창 위에 떠 있는 효과를 주는 버튼을 말합니다.
Android에선 support library를 통해서 FloatingActionButton을 지원해주고 있습니다.
iOS 에선 직접 버튼을 배치해서 사용했습니다.

#### 5) FloatingActionButtonLocation

버튼의 위치를 설정합니다
버튼을 하단 영역에 반쯤 걸치려면 보통 귀찮은게 아닌데, flutter에선 너무나도 가볍게 설정 되버립니다..