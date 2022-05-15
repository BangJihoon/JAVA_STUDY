자바스크립트에 Promise, async/await 와 같이

Flutter에도 비동기 처리 프로그램을 제어하기 위해 존재하는  Future와 async/await 가 있습니다.



# 1. 비동기 처리
   일반적인 프로그래밍은 단일 스레드 환경에서 순차적으로 (동기적으로) 수행이 이루어집니다.

프로그램에서 파일 읽기, 데이터베이스 쿼리, 웹 페이지 가져오기 등 과 같이

긴 작업을 하면 오랜시간을 프로그래밍이 멈춰있게 되므로 이런 작업을 비동기 처리로 진행합니다.



비동기 계산은 시간이 걸리는 작업이 끝날때까지 기다리지 않고, 계속적으로 다른 작업들을 처리할 수 있도록 해줍니다.

Dart에 Future클래스는 미래에 요청한 데이터 혹은 에러가 담길 그릇과 같습니다.



# 2. Future 란?
   Future는 크게 두가지 상태를 가지며, [ 완료 / 미완료 ]

두가지의 결과 값을 가질 수 있습니다.   [ data / error ]

Future 타입으로 작성한 메소드를 수행하면, 비동기적으로 실행이 되고,

두가지 결과값 Case에 맞게 then, catchError 키워드로 분기를 다룹니다.

![](https://blog.kakaocdn.net/dn/bBfzb3/btrBlMxOMab/KPnDdGVk0hWLVXNtk2IUg0/img.png)


Example Code

Future 클래스 타입에 메소드는 반환값은 Future클래스로 받아야 합니다.

then, catchError로 반환값이 data일때와, error일때 수행할 코드를 작성해줍니다.
```
import 'dart:async';

Future<int> futureNumber() {
  // 3초 후 100이 상자에서 나옵니다
  return Future<int>.delayed(Duration(seconds: 3), () {
    return 100;
  });
}

void main() {
  // future 라는 변수에서 미래에(3초 후에) int가 나올 것입니다
  Future<int> future = futureNumber();

  future.then((val) {
    // int가 나오면 해당 값을 출력
    print('val: $val');
  }).catchError((error) {
    // error가 해당 에러를 출력
    print('error: $error');
  });

  print('기다리는 중');
}
```

```
기다리는 중
val: 100
```

main에서 futureNumber를 실행하였을때,

순차적인 동기 실행이라면, "val: 100" 출력 후 "기다리는 중" 이 프린트 되겠지만,

future 타입 futureNumber()를 수행하였기에, 결과가 오기전까지 다음 작업들을 진행한 것입니다.



# 3. async / await 란?
   비동기 처리에 장점은 기다리지 않고 바로 다음 코드들을 수행한다는 것인데요,

하지만, 비동기 처리라도 때로는 기다림이 필요할떄가 있습니다.

외부 요청에 의해 받아온 반환값이 있어야 후 작업들을 진행할 수 있는 경우라면, 비동기 요청을 했어도 기다림이 필요합니다.

await은 "기다리다"는 의미로 비동기처리 요청 후 결과가 올 때까지 기다리라는 메소드입니다.

await은 반드시 async를 명시해준 메소드안에서 사용이 가능하며,

async는 비동기 Future 타입의 메소드에만 붙일 수 있다는 규칙이 있습니다.





Example Code

아래 Future타입의 createData() 메소드가 있습니다.

자세히보면, 조금 많이 복잡하고 가독성이 떨어지지만,

createData() -> id -> _loadFromDisk() -> data -> processedData()

세가지 메소드가 각각 앞선 비동기처리의 결과값을 필요로 하고 있습니다.
```
Future<ProcessedData> createData() {
  return _loadFromDisk().then((id){
    return _fetchNetworkData(id);
  }).then((data){
    return ProcessedData(data);
  })
}
```
이 코드를 Async / await 로 작성하면?

```
Future<ProcessedData> createDate() async {
  final id = await _loadFromDisk();
  final data = await _fetchNetworkData(id);
  return ProcessedData(data);
}
```
훨씬 깔끔하고 직관적으로 작성할 수 있습니다.





비동기 프로그래밍에서 Future 타입 메소드 호출 시,

기다릴 필요없이 이후 코드들을 수행을 시켜야 할 때는 then ,catchError 로 작업하고,

결과값이 필요한 프로그래밍에서는 async/ await을 사용해 기다려 줍니다.





https://dart.dev/codelabs/async-await

