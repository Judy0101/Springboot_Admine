package com.example.study01.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// 모든 매개 변수를 가지는 생성자를 추가한다.
public class SearchParam {

    private String account;
    private String email;
    private int page;

}
