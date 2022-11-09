package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class User {

    @ApiModelProperty(value = "아이디", required = true)
    private String id;

    @ApiModelProperty(value = "패스워드", required = true)
    private String pw;

    @ApiModelProperty(value = "나이", required = true)
    private int age;

}
