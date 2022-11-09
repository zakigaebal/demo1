package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "헬로우", value="HelloController", description = "헬로 에이피아이")
public class HelloController {
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    @ApiOperation(value = "hello, World를 반환하는 API, Ajax 통신 확인용.")
    public String helloWorld() {
        return "hello, World";
    }

}
