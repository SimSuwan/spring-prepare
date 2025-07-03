package com.metaverse.springprepare.domain;

import lombok.Getter;

@Getter
//@Setter // 값 변경(선택적요소) Getter 추가 시 무조건 함께 넣는 것 아님
public class Memo {
    private String username;
    private String content;
    private String description;
    private String password;
}
