package com.example.demo.controller;

import com.example.demo.dto.UserReq;
import com.example.demo.dto.UserRes;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

// @Api, 클래스를 스웨거의 리소스로 표시
@Api(tags = {"Api 정보를 제공하는 Controller"})
@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    //메소드 파라미터 메타데이터 설정
//    @GetMapping("/plus/{x}")
//    public int plus(
//            @ApiParam(value = "x값")
//            @PathVariable int x,
//            @ApiParam(value = "y값")
//            @RequestParam int y
//    ){
//        return x+y;
//    }

    // 메소드 단위 오퍼레이션 파라미터 설정
    @ApiImplicitParams({
            @ApiImplicitParam(name = "x", value = "x 값", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "y", value = "y 값", required = true, dataType = "int", paramType = "query")
    })
    @GetMapping("/plus/{x}")
    public int plus(@PathVariable int x,@RequestParam int y) {
        return x + y;
    }

    // 오퍼레이션 응답지정
    @ApiResponse(code = 502, message = "사용자의 나이가 10살 이하일때")
    // http 메소드 설명 추가
    @ApiOperation(value = "사용자의 이름과 나이를 리턴하는 메소드")
    // 모델의 속성 데이터 설정
    @GetMapping("/user")
    public UserRes user(UserReq userReq) {
        return new UserRes(userReq.getName(), userReq.getAge());
    }
    // post
    @PostMapping("/user")
    public UserRes userPost(@RequestBody UserReq userReq) {
        return new UserRes(userReq.getName(), userReq.getAge());
    }

}
