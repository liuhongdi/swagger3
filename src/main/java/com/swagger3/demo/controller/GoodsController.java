package com.swagger3.demo.controller;

import com.swagger3.demo.pojo.Goods;
import com.swagger3.demo.result.RestResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.math.BigDecimal;
import java.util.Map;


@Api(tags = "商品信息管理接口")
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Operation(summary = "商品详情,针对得到单个商品的信息")
    @GetMapping("/one")
    public RestResult<Goods> one(@Parameter(description = "商品id,正整数") @RequestParam(value="goodsid",required = false,defaultValue = "0") Integer goodsid) {
        Goods goodsone = new Goods();
        goodsone.setGoodsId(3L);
        goodsone.setGoodsName("电子书");
        goodsone.setSubject("学python,学ai");
        goodsone.setPrice(new BigDecimal(60));
        goodsone.setStock(10);
        RestResult res = new RestResult();
        return res.success(goodsone);
    }

    @Operation(summary = "提交订单")
    @PostMapping("/order")

    @ApiImplicitParams({
            @ApiImplicitParam(name="userid",value="用户id",dataTypeClass = Long.class, paramType = "query",example="12345"),
            @ApiImplicitParam(name="goodsid",value="商品id",dataTypeClass = Integer.class, paramType = "query",example="12345"),
            @ApiImplicitParam(name="mobile",value="手机号",dataTypeClass = String.class, paramType = "query",example="13866668888"),
            @ApiImplicitParam(name="comment",value="发货备注",dataTypeClass = String.class, paramType = "query",example="请在情人节当天送到")
    })

    public RestResult<String> order(@ApiIgnore @RequestParam Map<String,String> params) {
        System.out.println(params);
        RestResult res = new RestResult();
        return res.success("success");
    }
}