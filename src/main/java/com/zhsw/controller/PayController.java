package com.zhsw.controller;

import com.alipay.api.AlipayApiException;
import com.zhsw.service.AliPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @author zhengLiang
 * @description 支付管理
 * @date 2020/1/11 13:55
 */
@Controller
public class PayController {
    @Resource
    private AliPayService aliPayService;
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/pay")
    @ResponseBody
    public String webPay(@RequestParam("price") String price) throws AlipayApiException {
        System.err.println(price);
        return  aliPayService.webPay(price);
    }
    @GetMapping("/returnDeal")
    public String returnDeal(HttpServletRequest httpServletRequest) throws UnsupportedEncodingException, AlipayApiException {
        return aliPayService.returnDeal( httpServletRequest);
    }
}
