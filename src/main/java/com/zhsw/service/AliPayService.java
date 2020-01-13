package com.zhsw.service;

import com.alipay.api.AlipayApiException;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @author zhengLiang
 * @description
 * @date 2020/1/11 13:57
 */
public interface AliPayService {
    /**
     * 生成支付订单
     * @param price
     * @return
     * @throws AlipayApiException
     */
    String webPay(String price) throws AlipayApiException;

    /**
     * 同步通知
     * @param httpServletRequest
     * @return
     * @throws UnsupportedEncodingException
     * @throws AlipayApiException
     */
    String returnDeal(HttpServletRequest httpServletRequest) throws UnsupportedEncodingException, AlipayApiException;
}
