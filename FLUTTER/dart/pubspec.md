https://dart.dev/tools/pub/pubspec


# 1.  Pubspec.yaml 이란?

플러터 프로젝트에서 사용하는 모든 메타데이터 (패키지, 프로젝트 버전, 자원 등)의 종속성을 명시하고,

관리하는 파일입니다.



### + YAML 이란?
xml과 json보다 구성 파일에 더 많이 사용되는 직렬화 언어입니다.

아래와 같이 Key: Value 구조로 명시하며, 들여쓰기 및 Array( - 하이픈) 표기법 등의 작성법이 존재합니다.

![](https://blog.kakaocdn.net/dn/dsoto1/btrBilnrGGd/lMtANkY47l6FHmNnbRgzUK/img.jpg)
![](https://blog.kakaocdn.net/dn/S1tP0/btrBgWie3pJ/2kKCks2zNtBh6AZRz1gRa0/img.png)

가독성의 차이가 확연이 나는 샘플



# 2.  필드 종류


name
모든 패키지에 필요합니다.


version
pub.dev 사이트에서 호스팅되는 패키지에 필요합니다.


description
pub.dev 사이트에서 호스팅되는 패키지에 필요합니다.

homepage
선택 과목. 패키지의 홈페이지(또는 소스 코드 저장소)를 가리키는 URL.

repository
선택 과목. 패키지의 소스 코드 저장소를 가리키는 URL입니다.

issue_tracker
선택 과목. 패키지의 문제 추적기를 가리키는 URL입니다.

documentation
선택 과목. 패키지에 대한 문서를 가리키는 URL입니다.

dependencies
패키지에 종속성이 없으면 생략할 수 있습니다.

dev_dependencies
패키지에 개발 종속성이 없는 경우 생략할 수 있습니다.

dependency_overrides
종속성을 재정의할 필요가 없으면 생략할 수 있습니다.

environment
Dart 2부터 필요합니다 . 자세히 알아보기

executables
선택 과목. 패키지의 실행 파일을 PATH에 넣는 데 사용됩니다.

platforms
선택 과목. pub.dev 사이트에서 지원되는 플랫폼을 명시적으로 선언하는 데 사용됩니다.

publish_to
선택 과목. 패키지를 게시할 위치를 지정합니다.

false_secrets
선택 과목. 잠재적인 비밀 누출에 대한 사전 게시 검색을 수행할 때 무시할 파일을 지정합니다.



Pub는 이와에 다른 모든 필드를 무시합니다.



# 3. 예시 코드

```
   description: >-
   Have you been turned into a newt?  Would you like to be?
   This package can help. It has all of the
   newt-transmogrification functionality you have been looking
   for.
   version: 1.2.3
   homepage: https://example-pet-store.com/newtify
   documentation: https://example-pet-store.com/newtify/docs

environment:
sdk: '>=2.10.0 <3.0.0'

dependencies:
efts: ^2.0.4
transmogrify: ^0.4.0

dev_dependencies:
test: '>=1.15.0 <2.0.0'
```
1) 이름 : 모든 패키지에는 고유한 이름이 필수적입니다.

2) 설명 : 사이트에 해당 패키지가 호스팅 될때 보이는 설명입니다.

3) 버전 : 패키지 버전은 생략가능하며, 생략시 0.0.0 으로 지정

4) 홈페이지, 저자 등의 정보를 명시할수 있습니다.

5) 종속성 : 패키지의 동작을 위해 사용되는 필요 패키지들을 작성합니다.

6) 개발 종속성 : 개발단계에서만 필요한 일시적인 종속성을 따로 작성합니다.