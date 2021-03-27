package com.example.study01.controller;

import com.example.study01.Model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
//주소가 똑같은 것이 겹치면 스프링 부트는 실행되지 못한다.
// 클래스는 상관없다.
public class PostController {

    // HTML <FORM>
    // ajax 검색
    // http post body -> data
    // json, xml, multipart-form/ text-plain

    @PostMapping(value = "/postMethod")
    public SearchParam getMethod(@RequestBody SearchParam searchParam){


        return searchParam;

    }




}
