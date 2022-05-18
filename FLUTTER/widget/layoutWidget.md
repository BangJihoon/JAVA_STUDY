
기본 구조를 잡는 위젯들의 사용법을 모르면,

잘 개발하다가도 왜 위젯이 안나오는지, 왜 초과해서 사라지는지,

애꿎은 위젯에 시간만 쏟으며 이유를 모르게 될 때가 있다.



미연에 방지하고자 (이미 시간을 많이 버렸지만)  기본 레이아웃을 정리한다.



위젯은 UI를 만들기 위해 사용하는 Class입니다.

이미지, 아이콘, 글자들도 모두 위젯입니다.

하지만 row, column, grid 같이 눈에 보이지않는 레이아웃 위젯들도 있는데요.

이들은 보이는 위젯(이미지, 아이콘, 글자 등)들을 제어하고, 제한하며, 정렬시켜줍니다.

![](https://blog.kakaocdn.net/dn/dsmzv4/btrCiR0KLDv/E9SDqCdHsJphfb4KxtMBM0/img.png)



## 1. Container

단 하나의 자식을 가지는 최상위 레벨에서 자주 사용되는 레이아웃 위젯입니다.

해당 레이아웃에서 하위 위젯에 대한 배경 Color, 여백, 간격, 테두리, 등의 스타일을 넣어줄 수 있습니다.

#### 예시 코드
```
@override
Widget build(BuildContext context) {
  return Scaffold(
    appBar: AppBar(
      title: Text('Container'),
    ),
    body: Container(
      child: Text(
        'Hello world',
        style: TextStyle(color: Colors.red),
      ),
      padding: EdgeInsets.fromLTRB(20.0, 30.0, 40.0, 50.0),
      margin: EdgeInsets.all(100.0),
      width: 200,
      height: 100,
      transform: Matrix4.rotationZ(0.5),
      decoration: BoxDecoration(
        color: Colors.yellow,
        border: Border.all(color: Colors.black, width: 3),
        borderRadius: BorderRadius.all(Radius.circular(18)),
        boxShadow: const [
          BoxShadow(blurRadius: 10),
        ],
      ),
    ),
  );
}
```
![](https://blog.kakaocdn.net/dn/caY8qb/btrCme1gAhj/UkVHrO3E4ujFv3RbSDkWY1/img.jpg)



## 2. Row , Column
   가로 행과 세로 열로, 둘은 정 반대의 정렬을 가집니다.

Row는  하나의 가로축을 기준으로 왼쪽에서부터 오른쪽으로 위젯을 표현해줍니다.

```
Row(
  children: <Widget>[
    Expanded(
      child: FlutterLogo()
    ),
    Expanded(
      child: Text('Hello, Flutter Beginner!')
    ),
    Expanded(
      child: Icon(Icons.sentiment_very_satisfied),
    )
  ]
)
```
![](https://blog.kakaocdn.net/dn/P779X/btrCllTRo0h/BIEh9kpyiO3DyiC7ZN1ze0/img.png)


Column 은 하나의 세로 축을 기준으로 위에서 아래로 위젯을 추가해갑니다.

```
Column(
  children: <Widget>[
    FlutterLogo(),
    Text('Hello, Flutter Beginner!'),
    Icon(Icons.sentiment_very_satisfied),
  ]
)
```
![](https://blog.kakaocdn.net/dn/boXVaW/btrCicjL8Oa/a8oWxmXOADOKqdzlIEkUz0/img.png)


보통은 새로로 긴 스마트폰에 표현해야하므로, Column을 만들고

그 안에 각각 Row를 만들어 위젯을 표현합니다.



## 3. Center

센터위젯으로 감싸주면

이렇게 원하는 위젯들을 좌측 상단부터가 아닌,

가운데 alignment 해줄 수 있습니다.

![](https://blog.kakaocdn.net/dn/MBv5z/btrCiP9KIg3/MJxxzNrzQuY7qLKcCIkeM1/img.png)






## 4. Expanded
Expanded를 사용해 위젯을 감싸주면, 안전하게 기기크기를 넘지않고 공간을 최대로 차지하도록 설정해주게 됩니다.

이때 각각의 위젯별로 Expanded를 해주면, 각각 1:1:1 사이즈로 Flex가 설정되며,

다른 설정을 위해 Flex값(가중치)를  변경해 줄 수 있습니다.



## 5. SafeArea
만약 위젯이 보이지 않는 노치부분이나,

상단바 부분에서 부터 생성되는 문제가 발생하면?

```
@override
Widget build(BuildContext context) {
  return Scaffold(
    body: Text('Hello world'),
  );
}
```
![](https://blog.kakaocdn.net/dn/eOLgb4/btrCmdH3yoA/8ffDIHKDLc7AuJv9HAnHp0/img.jpg)

이럴땐  SafeArea로 감싸 안전한 영역에서부터 시작하도록 만들어 줄 수 있다.

```
@override
Widget build(BuildContext context) {
  return Scaffold(
    body: SafeArea(
      child: Text('Hello world'),
    ),
  );
}
```
![](https://blog.kakaocdn.net/dn/eOLgb4/btrCmdH3yoA/8ffDIHKDLc7AuJv9HAnHp0/img.jpg)


## 6. SizedBox
SizedBox 위젯은 위젯과 위젯 사이에 빈 공간을 추가할 때, 사용됩니다.

```
@override
Widget build(BuildContext context) {
  return Scaffold(
    body: Column(
      children: [
        Container(
          color: Colors.red,
          width: 100,
          height: 100,
        ),
        SizedBox(
          height: 200,
        ),
        Container(
          color: Colors.yellow,
          width: 100,
          height: 100,
        ),
        SizedBox(
          height: 50,
        ),
        Container(
          color: Colors.green,
          width: 100,
          height: 100,
        ),
      ],
    ),
  );
}
```
![](https://blog.kakaocdn.net/dn/c4hGPj/btrCkglffjT/DM9k5plDiuIiyK1QoHSiB1/img.jpg)


## 7. Stack
Stack 위젯을 사용하면,

위젯 위에 위젯을 쌓아 올릴 수 있습니다.
``` 
@override
Widget build(BuildContext context) {
  return Scaffold(
    body: Stack(
      children: [
        Container(
          width: 400,
          height: 400,
          color: Colors.green,
        ),
        Container(
          width: 200,
          height: 200,
          color: Colors.yellow,
        ),
        Container(
          width: 50,
          height: 50,
          color: Colors.red,
        ),
      ],
    ),
  );
}
```

![](https://blog.kakaocdn.net/dn/bqc6DY/btrCaty6OVQ/u1sl9WfSDN6JK3QaXkdIO1/img.jpg)





참고글 :https://flutter-ko.dev/docs/development/ui/layout

https://medium.com/flutter-korea/row-column-widgets-8c1ff09a6219

https://dev-yakuza.posstree.com/ko/flutter/layout/