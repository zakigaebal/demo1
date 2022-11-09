package com.example.demo.controller;

import com.example.demo.dto.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = { "1. Swagger Test" }) // Swagger 최상단 Controller 명칭
//@ApiIgnore // 제외처리
public class SwaggerController {

    @ApiOperation(value = "Get 통신", notes = "Get 통신 Note", response = String.class) // value: 해당 파라미터 명칭, notes : 메소드에 대한 설명란
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "페이지 없음"),
            @ApiResponse(code = 500, message = "서버 에러")
    })
    @GetMapping(value = "/swagger", produces = "application/json")
    public String GetRestApi(
            @ApiParam(value = "파라미터 1", required = true) @RequestParam(required = true, defaultValue = " ") String param1,
            @ApiParam(value = "파라미터 2", required = true) @RequestParam(required = true, defaultValue = "0") int    param2  ) {

        String result = "테스트";

        return result;
    }

    @ApiOperation(value = "Post 통신", notes = "Post 통신 Note", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "페이지 없음"),
            @ApiResponse(code = 500, message = "서버 에러")
    })
    @PostMapping(value = "/swagger", produces = "application/json")
    public String PostRestApi(@RequestBody User user) {

        String result = "테스트";

        return result;
    }

}


