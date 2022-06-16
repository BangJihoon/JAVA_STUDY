# Pop up 팝업창 띄우는 법 (Alert Dialog)

![img.png](img.png)

한 Row안에 Text와 ? 아이콘 버튼을 만들어 버튼 클릭시

영상업로드팁 다이어로그를 팝업으로 띄워보겠다.

```
Row(
  children: [
    const Text("영상 업로드"),
    IconButton(
      onPressed: () {
        showDialog(
            context: context,
            barrierDismissible: true, // 바깥 영역 터치시 닫을지 여부
            builder: (BuildContext context) {
              return AlertDialog(
                content: const ScreenVideoTips(),
                insetPadding: const  EdgeInsets.fromLTRB(0,80,0, 80),
                actions: [
                  TextButton(
                    child: const Text('확인'),
                    onPressed: () {
                      Navigator.of(context).pop();
                    },
                  ),
                ],
              );
            }
        );
      },
      icon: Icon(Icons.help),
    )
  ],
),
```

context는 지금 화면에 데이터

builder 내부에 context를 받아서 들어갔다가 되돌아오는 방향으로 구현된다.

content에 alert을 띄울 화면을 넣어주고,

기타 옵션을 설정해주면 된다.



다양한 옵션은 아래 [api문서를 참고](https://api.flutter.dev/flutter/material/AlertDialog-class.html)

