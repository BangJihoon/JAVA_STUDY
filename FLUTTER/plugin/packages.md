
개발자에게 다양한 패키지의 존재를 알고 있는 것만으로도 강력한 개발 무기가되므로 많은 사람들이 추천하는  플러터 패키지들을 정리해보자



### permission_handler
대부분의 운영 체제에서 권한은 설치 시 앱에만 부여되지 않습니다.

오히려 개발자는 앱이 실행되는 동안 사용자에게 권한을 요청해야 합니다.

플러그인은 권한을 요청하고 상태를 확인할 수 있으며,

사용자가 권한을 부여할 수 있도록 기기의 앱 설정을 열 수도 있습니다.

Android에서는 권한을 요청하는 설명까지 보여줄 수 있습니다.



### url_launcher
앱상에서 다양한 정보를 링크하여 열 수 있게 해주는 라이브러리입니다.

기본 전화앱, SMS, Mail, Web Page 등을 연결해줄수 있습니다.

해당 플러그인을 실행하기 위해서는 권한을 필수적으로 얻어야 합니다.



### shared_preference
유저 설정값이나 간단한 데이터를 서버가 아닌 로컬저장하고 싶다면,

shared_preference를 사용합니다.

shared_preference는 key-value페어를 사용한 데이터 저장 방법을 사용합니다.

String key를 통해 데이터를 저장 및 가져오기를 실행합니다.

여기서 중요한것은 value는 integer, double, boolean, String 그리고 List String만을 지원합니다.

한가지 더 반드시 알아야 하는것은 이전에 저장한 데이터가 100% 보장되지는 않는다고 합니다.

그렇기 때문에 아주 중요한 데이터들은 shared_preference에 저장하시면 안됩니다.



### provider
앱의 상태관리를 다루는 플러그인중 하나이며 가장 범용적으로 쓰이고 있습니다.

현재는 provider가 직면한 문제를 해결하며 등장한 riverpod 가 많은 인기를 얻고 있습니다.



### riverpod
상태 관리법에는 Bloc, provider, Riverpod, getX 등이 있다.

그중에서도 riverpod은 provider의 단점을 보완하기 위하여 나온것으로 provider의 연장선이라고 생각해도 된다.

기존의 Provider가 가지는 문제점을 개선한 Riverpod에 장점 (공식문서)

+ Riverpod은 컴파일 타임 동안 안전하다.
+ Flutter SDK에 직접적으로 의존하지 않는다.
+ Provider의 제한사항이 없다 (변수타입 등).
+ 어디서든 명시된 상태를 공유한다.
+ 상태 또는 UI rebuild를 필요할 때만 한다.
+ Riverpod은 loading/error 케이스를 깔끔하게 다룰 수 있다.
+ devtool로 상태를 검사할 수 있다.



### http
대다수의 어플리케이션들은 서버와 통신을 합니다.

http플러그인은 다양한 서버와 웹에 요청을 보다 쉽게 할 수 있도록 도와줍니다.



### hive
hive는  key-value방식으로 데이터를 로컬에 저장합니다.

언어는 Dart언어를 그대로 사용하면 됩니다.

저장 방법이라던지 데이터구조변경, 데이터가져오기등이 relational Database보다는 훨씬 간단하고 속도도 빨라서 인기가 좋습니다.



### logging
올바른 프로젝트는 개발시에 명확하고 깔끔한 디버깅이 필수입니다.

개발시 어플리케이션이 잘 동작하는지 버그 발생시 어느부분에서 데이터가 잘못되었는지

에러 발생시 어떤 에러가 발생했는지에 대해서 로그를 통해 표시를 해줘야 개발자로서

시간과 비용이 크게 낭비될 수 있는 위험을 방지할 수 있습니다.

print나 alert은 아주 중요한 데이터들이 노출될 위험이 크므로 디버깅에 사용은 금물입니다.



### cupertino_icons
다양한 아이콘을 원하는 색상과 크기로 사용할 수 있도록 다양한 기본 아이콘들을 제공해줍니다.

[여기서 원하는 아이콘을 선택해서 내려받으면](https://www.fluttericon.com/%20), 아이콘 리소스가 깔끔하게 분리된 dart 코드를 얻을수 있습니다.

더 많은 아이콘 상수값을 확인하기 위해서는 [이곳을 방문하세요](https://api.flutter.dev/flutter/cupertino/CupertinoIcons-class.html#constants)

