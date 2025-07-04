package com.metaverse.springprepare.domain;

import lombok.RequiredArgsConstructor;

//@Getter
//@Setter // 값 변경(선택적요소) Getter 추가 시 무조건 함께 넣는 것 아님
//@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private String content;
    private String description;
    private final String password;
}
