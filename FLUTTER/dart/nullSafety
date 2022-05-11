#  Null Safety란?

Dart는 2.12 및 Flutter 2에서 가장 큰 변화라 할 수 있는  Null Safety!

뜻밖에 널 익셥선을 방지하는 견고한 널 안전성을 지원하는 null safety는

변수가 더 이상 null값을 가지지 않도록 막아, 널 역참조 오류를 막는다.

안전성을 지키는 코드 형식은 런타임 에러를 미연에 방지하고  edit-time 에러를 내어줍니다.


![](https://blog.kakaocdn.net/dn/cjBKZQ/btrBEdiGBXw/gSfbSqyHNaL3Cf4R3XCX3K/img.png)


```
// null-safety 적용 이전
bool isEmpty(String string) => string.length == 0;
main(){
isEmpty(null);
}
```

널 안전성이 추가되기전 과거 이 코드는 NoSuchMethodError 라는 런타임 에러를 호출했습니다.

dart에서 null은 Null클래스이며, String 클래스가 아니기 때문에

“length” 라는 이름의 메서드 사용이 존재하지 않았기 때문입니다.

하지만 2.0부터는 Null 클래스가 분리되어,

모든 자료형은 null을 서브타입으로 가지지 않는 Non Nullable 클래스가 되었습니다.


#  Nullable 연산자 "?"
 
모든 타입이 Null을 가질 수 없으므로

선택적으로 Null값을 가질수있도록 "?" 조건연산자를추가하여 Nullable 클래스화를 지원합니다.

![](https://blog.kakaocdn.net/dn/CWP39/btrBzU5xD1h/RwOc79Kv2nMvMPxxoN5sHk/img.png)

```dart
int? x= null;
```

![](https://blog.kakaocdn.net/dn/qhMGN/btrBzU5yUiF/Wf4j7Stel53zBKBaPAd8mK/img.png)
![](https://blog.kakaocdn.net/dn/GibTH/btrBEdbYINX/EI5yMQ2TNC3TAkG6OCiZIK/img.png)





[참조](https://dart.dev/null-safety/understanding-null-safety)