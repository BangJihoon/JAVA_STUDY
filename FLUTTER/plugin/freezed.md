Freezed는 아래와 같이 Class를 정의할 때 지루한 작업을 자동화합니다

+ Define a constructor + the properties
+ Override toString, operator ==, hashCode
+ Implement a copyWith method to clone the object
+ handling de/serialization

+ 자바에서 롬복 + 직렬화 등을 합쳐놓은것 같은 강력한 플러그인입니다.



### 설치
```
dependencies:
  freezed_annotation:

dev_dependencies:
  build_runner:
  freezed:
  json_serializable:
```
필수는 freezed_annotation, freezed이며,

toJson, fromJson 기능을 사용하기 위해 json_serializable을 추가해주어야 합니다.





### 기본 코드
Person이라는 Class를 만들 때

Freezed를 이용해서 객체생성시 유용한 메소드들을 한번에 만들어줍니다.
```
// This file is "main.dart"
import 'package:freezed_annotation/freezed_annotation.dart';

        part 'main.freezed.dart';
        part 'main.g.dart';

@freezed
class Person with _$Person {
  const factory Person({
        required String firstName,
                required String lastName,
        required int age,
    }) = _Person;

    factory Person.fromJson(Map<String, Object?> json)
      => _$PersonFromJson(json);
}
```

```
import 'package:freezed_annotation/freezed_annotation.dart';

part 'my_file.freezed.dart';
```
사용을 위해 상단에 두줄을 필수적으로 명시되어야 합니다.

part 'main.g.dart';
이 두 부분은 객체를 읽기 쉽게, 직렬화사용을 위한 선택적인 import 부분입니다 (file명.g.dart)

firstName, lastName, age 3가지 필드가 생성시 필수로 전달되야 한다는 의미로 required 를 씁니다. (다트문법)

팩터리 메서드 패턴으로 _Person (private 필드)로 반환하여 관리됨을 유추해 볼 수 있습니다.

```
factory Person.fromJson(Map<String, Object?> json)
=> _$PersonFromJson(json);
```
이렇게 명시하므로써, 직렬화도 사용이 가능합니다.



### 클라이언트쪽 사용 코드
아래와 같이 단순 사용에도,

이미 생성자, 필드접근, ==, toString,  hashCode, toJson, copyWith 등이

Override 되어있음을 확인 할 수 있습니다.
```
final person1 = Person(firstName: 'bang', lastName: 'jihoon', age: 20 );

// bang
print(person1.id);

// jihoon
print(person2.name);

// 20
print(person3.age);

// Person(firstName: bang, lastName: Code jihoon, age: 20)
print(person1);

// {firstName: bang, lastName: jihoon, age: 20}
print(person1.toJson());
final person1 = Person(firstName: 'bang', lastName: 'jihoon', age: 20);
final person2 = Person(firstName: 'bang', lastName: 'jihoon', age: 20);

// true
print(person1 == person2);
```