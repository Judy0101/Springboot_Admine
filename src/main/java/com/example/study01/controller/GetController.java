package com.example.study01.controller;

import com.example.study01.Model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //localhost:808/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") //localhost:8080/api/getMethod
    public String getRequest(){

        return "Hi getMethod";

    }

    @GetMapping("/getParameter") // Locallhost:8080/api/getParaneter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "pw") String password){
        String pw = "bbbb";

        System.out.println("id : " + id);
        System.out.println("pw : " + password);

        return id+password;
    }

    /// localhost:8080/api/multiParameter?acount=abc&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());


        // {"account" : "", "email" : "", "page":0} 제이슨형식으로 보내줄라면 어떡할까?
        // 스트링부트의 제이슨 라이브러리를 사용하자.
        return searchParam;

    }
}
