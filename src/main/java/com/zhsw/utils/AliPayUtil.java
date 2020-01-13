package com.zhsw.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 * @author zhengLiang
 * @description  支付工具类
 * @date 2020/1/11 13:57
 */
public class AliPayUtil {
    /**
     * 生成订单号
     * @return  时间戳+9位随机数
     */
    public static String getOutTradeNo(){
        String var = "";
        Random random = new Random();
        for (int i = 0;i < 9;i ++){
            var +=String.valueOf(random.nextInt(10)) ;
        }
        return     System.currentTimeMillis()+""+var;
    }

    /**
     * 得到支付宝回传参数
     * @param request
     * @return
     */
    public static Map<String,String> getParams(HttpServletRequest request){
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            // valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        return params;
    }
}
