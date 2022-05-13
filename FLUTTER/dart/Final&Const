
## 가장 큰 차이점


Dart에서 상수를 지정하는 키워드 두 가지가 있습니다.

Final , Const 둘다 선언후에 재설정이 불가하지만, 어떤 차이가 있을까요?



const는 컴파일 타임에 반드시 값이 결정되어야 하며,

final은 런타임 시점에도 값을 초기화 해줄 수도 있습니다.



### 예시코드
1) 컴파일 시점 초기화

아래와 같이 컴파일 시점에 초기화는 모두 에러없이 수행된다.

![](https://blog.kakaocdn.net/dn/c6uXaH/btrBhSs2Yr1/uTG7LkZMAZFlm6iOLhwQOk/img.png)


2) 런타임시점 초기화

아래와 같이 런타임 시점에 값이 결정되는 경우, const 는 지정 불가하다는 에러가 발생한다.
```

main() {
const DateTime now1 = new DateTime.now(); // error const 는 실행시에 결정되는 값을 설정할 수 없다. 정해진 값만 가능하다.
final DateTime nw = new DateTime.now(); // final 은 실행시에 결정되는 값도 설정할 수 있다.
}
```
![](https://blog.kakaocdn.net/dn/ycHgn/btrBjJVUbxC/BEWI2Hwlz82MeK0YO6Wovk/img.png)

const는 반드시 컴파일시점에 초기화가 필요하다는것을 알 수 있다.



const 는 우리가 흔히 사용하는 상수 변수 (원주율, 최댓값, 이름, 타이틀 등)에 많이 사용하며

final 은 const 사용의 경우뿐 아니라, 인스턴스를 담거나, 지연 초기화 등이 필요한 부분에서 사용이 가능합니다.





## 차이점 2
const는 컴파일 된 후 object에 필드 수정이 불가하지만,

final은 런타임중에 오브젝트의 필드 값을 변경 할 수 있습니다.

![](https://blog.kakaocdn.net/dn/b2JKpb/btrBhXm0p4P/mEbkZ3yp3ooPo8224jDwQK/img.png)
![](https://blog.kakaocdn.net/dn/ewssnK/btrBjJayDcu/ET0pQCP2SFtUFEH3Eha59K/img.png)




참조 : https://dart.dev/guides/language/language-tour#final-and-const

