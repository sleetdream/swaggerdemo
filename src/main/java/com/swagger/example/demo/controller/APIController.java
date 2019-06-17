package com.swagger.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * 自动扫描，可不添加
 * Api()规定Controller
 * ApiOperation()规定接口
 * ApiParam()规定参数
 */
@RestController
@RequestMapping("api")
@Api(description = "API接口示例")
public class APIController {

    @GetMapping("get")
    public String getDemo(
            @RequestParam(required = true, value = "name") String name ){
        return "Hello "+ name;
    }

    @ApiOperation(value = "get接口示例")
    @GetMapping("getAPIDemo")
    public String getAPIDemo(
            @RequestParam(required = true, value = "name") @ApiParam(required = true, value = "name")String name ){
        return "Hello "+ name;
    }

    @ApiOperation(value = "postDemo")
    @PostMapping("post")
    public String postDemo(
            @RequestParam(required = true, value = "name") @ApiParam(required = true, value = "name")String name ){
        return "Hello "+ name;
    }
} 