package com.zhsw.config;

import org.springframework.context.annotation.Configuration;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zhengLiang
 * @description  支付宝支付配置
 * @date 2020/1/11 13:56
 */
@Configuration
public class AliPayConfig {
    /**
     * 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
     */

    public static String APP_ID = "2016101100659631";

    /**
     * 商户私钥，您的PKCS8格式RSA2私钥，这些就是我们刚才设置的
     */

    public static String MERCHANT_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCTtqolHH1p9hf78hl5eZ4Jds1t9opd0mZhIxpQHlOc7oIFSz7BcJlznkGkeSGGlfO3RoGBsIB2tv4B33MTyEapyyAgNWBU3k+yNaaBs8wyGba8RES6XwuOKduBqPLRUuHrOieAs7kzp68j3qxDGz9/l3T8A570dOlJ09+X3/4MFM4gzRI48NGSWCVaEzn/9E/VKWBsDauT+bSTmNup1yuyNAlHol5su3v6hkNUBglMBCb8VPYgJsyy2YtLSVEue/5R9+asUc/uCwn2cCbExl5osgzi9q6RsH8Tv6YHPKW3loS/MvRHEywA2YSI9uPBFdbigrmyYlGPSCmZtm1WJ4IfAgMBAAECggEAHnRi0BP3p4kdmMxphCoW80yTPkC+dmmSwiRCoJIgGxLxq7W/0pIskTHnxslSqDTycq8OtHZ3hgJkjG5Ng56fMxK2JO3cVqMfO1bkZYl0aD/09Qv+P46pCz6GC02SAqZb/euXiWmEnanM6lBWo99SUDQh4nO8qhoQnzAXwXBlKIgxVSaqtb/v4xCL6orX4S5GmyD8opNOfMe2ff0jddd+rdSOB9LdpVmahaovoXS27+Rf2j/e/q7/j0Yc9Km+KAh7qK6gevdzr2dxaE9GzMphTyhAfEZxl56XAb8mNDEcUD82UJIIW+x9nM0rAiawpn4oAGBxsYyN48KBdVTax9LdQQKBgQDK70khn7/+agsreNNSJzOSNmFsvoHyTlrv9W+tJy51Wci5gh+Fz7qD//mAIZZzT6OohYifQjHN0lD611xsWUuxzsUsVpQ/2fS1lmV32aupPQSobr70lb0Sb/i7qOf6osc5eAucv3r4PA7yKijtdppmtVIyp+6rQ2N77TAEt9pCwwKBgQC6Vs0meSjWIcZm83YfF9ctTMo62QwVHwETBcPn+W7g/Kift4y+/noTH5hVPZHVQSBimfeqGxPMIlvFcwpley62lrUOH1QYqe3/MrWrgb3U+JGpe9EAzbgJDXSdTuI5YPttiWH7Q0vvFV+RUn7KPN0Tv0sqF15J/CkWtt0an48VdQKBgDJDIfHaB0uUKEAUJQLsArHsFiVA6h6BmbRlLcvNMIyQOE76E6So1qFq/PjnWMQmrXpH2JbZZkx8EuKOBK4xT7YyaFOa/gzyhtGS9n7Awuuf2U9+Xn1luPagFRMluo8xUfbB7N5d7q8c8Pa5ynlGLufRcRJq1YpFnpZLIOGKR9zRAoGBAJBd5c2T+y6DtmpW38JRPzXqk5eqR3EptzRcuB5Go0AOoDo2BAaJtFySkvwfmpflQEkETtxs5Ba42+8LJRfgqx1tf9L0NLxzE2Avko7RExkoh/oOYqxDtfzVfu7Nifm4iLOhx9bamb8fCQ7XIkJfi0zcXUi8GCIsCk192anhywJtAoGAH0PUVkI5hQ+zpPkId4xzEaYfwJzHJUizfSucv94kRJM+PWehoFFLn4xSPoe/ZCl3klNHMVToZ9EsNZUwuc5CrVepAErnZxFEfBD+YGqrYX8AzNnbkW439GYiwweFP/v2N+LYLNxYun+X9YPbqrZvUEe0Z1fmpYht3aNWpeFcsBo=";
    /**
     *  支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。，这些就是我们刚才设置的
     */
    public static String ALIPAY_PUBLIC_KEY ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkal2ajwqM3rysUxJaEf7ufkaakpoUcNNHYfNcvKd9VxqMKUvycy35TcFdU6W5ikoV1MM6jPh2oxBqjzBSGAM++Ed0sUWcAI5XIdiuO2GxZEgwH7n2uHwBQDrtV5Cj9mnFbR1ZqrGz0jFLEisJ58v+IDUcQcQaXqrrn1YLFK82C1wnlTp5jCqURrnafij43bZY61fXvVAlwi+7vcpqOzEWFXr9skGRMh6Zf4gbKhQQ91QraTCgq3jzAmx+jGECpn/QMj+BzP6n1oa+xQ/bkFJMCFxpTNVKWLrlwy9Q4CEPPGU4AytVx+8eHvQxzULiH8ty/iMcVwupHTb19atuwtH9wIDAQAB";
    /**
     * 异步通知，在这里我们设计自己的后台代码
     */
    public static String notify_url = "http://localhost:8080/notify";
    /**
     * 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */

    public static String return_url = "http://localhost:8080/returnDeal";

    /**
     *  签名方式
     */
    public static String SIGN_TYPE = "RSA2";

    /**
     *   字符编码格式
     */
    public static String CHARSET = "UTF-8";
    /**
     * 支付宝网关
     */
    public static String GATEWAYURL = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String LOG_PATH = "C:\\";
    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(LOG_PATH + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
