package com.swagger3.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "首页信息管理")
@RestController
@RequestMapping("/home")
public class HomeController {

    @Operation(summary = "首页详情")
    @GetMapping("/home")
    public String home() {
        return "success(this.userRecordService.getById(id))";
    }
}