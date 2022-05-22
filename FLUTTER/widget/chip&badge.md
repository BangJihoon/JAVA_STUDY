앱을 개발하다보면 작은 아이콘이나 이미지가 Text뒤에 붙어야 할때가 있다.

이럴때 Chip이라는 위젯이 존재한다.

또한

몇건의 알림이 왔는지, 장바구니의 몇개가 담겨져있는지, 좋아요가 몇개있지 간략하게 보여줄 필요가 있을떄

Badge 위젯을 사용한다.







### 1. Chip
![](https://blog.kakaocdn.net/dn/bBPBRH/btrCVQOiYQp/twRghaqNDrNliKFJQRXd8K/img.jpg)

칩은 Material 기본제공 위젯으로 위와 같은 버튼형식에

텍스트와 함께 첨부하는 데이터 또는 아이콘을 말한다.

라벨링을 하거나, 숫자정보 등을 표시하기에 안성맞춤이다.



#### 사용예제
https://medium.flutterdevs.com/chip-widgets-in-flutter-7a2d3d34597c
```
Widget _buildChip(String label, Color color) {
    return Chip(
      labelPadding: EdgeInsets.all(2.0),
      avatar: CircleAvatar(
        backgroundColor: Colors.white70,
        child: Text(label[0].toUpperCase()),
      ),
      label: Text(
        label,
        style: TextStyle(
          color: Colors.white,
        ),
      ),
      backgroundColor: color,
      elevation: 6.0,
      shadowColor: Colors.grey[60],
      padding: EdgeInsets.all(8.0),
    );
  }
```
![](https://blog.kakaocdn.net/dn/bBYRJO/btrCXl03xJy/8ik3tHkCrTkPSfANt2OcsK/img.png)


### 2. Badge

![](https://blog.kakaocdn.net/dn/GdLs1/btrCVQ8AqEG/01IEkvAwJUjRl15EvJeq40/img.png)

기본 제공되는 위젯은 아니지만,

아래와 같이 최근 모든앱에 곳곳에서 사용되는 유용한 위젯이다.

인터렉티브하게 많은 정보를 담고 보여주며 사용자의 눈과 손이 갈 수 밖에너는 UX를 제공한다.




#### 사용예제
https://pub.dev/packages/badges


![](https://blog.kakaocdn.net/dn/bgN5mc/btrCQ7PTxBs/9GBxiK4tVbE21PPbzMS13K/img.gif)

```
Badge(
    badgeContent: Text('3'),
    child: Icon(Icons.settings),
)
```

사용이 간단하지만,

다양한 애니메이션과 효과등을 넣어줄 수 있어서

Chip보다 더 많이 더 넓게 범용적으로 활용된다.