package com.briup.config;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000116681419";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCZZT4aU2yYMV8n6VzoRO204d3JUJ8MFzDnQXscVtkUTIxV2twzg/IP37gRAkq5v/g++ozoCcaVEg2aMpWeQLyC+inki6XnsYl6HPUCxbbT/sgohL13a7x6S4zJN3DskFYjoWwVJjWdPs0arSTvHAFTceHCehczBhio2Q8+9Q/TSY6+HyUEebQ+Pbj8zkr8YcdMIkygEuLoVmGxQi5Flsl92uM1H5Zt9S/XVFn9/YLuhaoIJSP5zEF9xr6WAE+pEdEwNNo5lA+2DvgfYgwpNwa/NMo4+HNc9Kp/vAUsYMl8ACR9JZCgIOk4tNYgRu8+x/ln2KmQ88oCDqO1HpRmMSuPAgMBAAECggEAUkdk/Vf8KtJouQ7Kf+fhHSH+BerRtPmHiLOt5nCLNgEtUSv460T+BRe6Mp1pGaNn89gO1rPPqcwqMaiqal1NAHBRIj7puZKYLED2BwuoWqQSFvHEcxb93RdDJ/cuAiYVnj0KrXl2TqcN+x4eboc2Ct1N/DPi18KQXZk4PUvTtj+oBrH9mxI7yjjS6+eUb3E4sd0fm/DWDAg0DHK02XIJFWYjsIWA2d3KHt22RVspxdWTbZNpKPbhR7Jd8AjiYpZWKhxWeCg52oxNowD+ZEG1Kf5xTeKFjv3a3uNwkNiDtszHf0bftbI7kpz3IOa3jtPX9pF4igh0/9yMCrRlD1mtmQKBgQD0/d4pbS4W8TUy5yrjuVwFQrIMRAyLa+H+1uqQCh+g/lzGrgBjFKkF5A0Zq3gEEuGHG2BgyEYC/maiz91a4s0EMk+HsceVcII9cH+0DeNGneuIFfRuVSKDdmUJIayIB2JDFFI19M3QrPmMwsqIKfbf/DZVNnlAp4T3XwkDZJpN/QKBgQCgSb8Tg24VU7MVwxDzZ7bHXfPg1ci7d8cIulK2/7EjILAkJ68XgVxjptQQUOE3kfCx5m8dkOFpTpBQToBx+JA6FkB+lBJnVOhC0azUcC550fQ57VSraLJDfarabIdZF5KRlgwDAZfKDoNhjvbLpAX09Edirn8PByvtSV+JN0FvewKBgH4euuHErPdukR51VuUIpVCn9xTNa0/S5/LTHMmuDH5Ks+Qr61MWbbT0o7HVTeF6/tMYytLIBxK/eILUU3XYUAabB8opQT+zPbj3UyaUB65w2bGi68Ro222l43mB9lnIw1MZAQF51wJYKdfG55CVWdwQ8L+JXX5lPtRB/lfa0HzZAoGAEsJOwIPjQE+5Z9SaiUIcHB0cy7V5dqc//f+AarZmDsxmkPSsAz46h9cgfoBYu14zIz7qxjUMjHyLWzq0waHrj0DHb4j41msTe656Yap3Zf5ybM0f2ae5JTjx4/pLpNujZbJ/2WI4V4d3TNWkgJTDtbVZHW16pVGbjHvH2JFE8T0CgYBgLaQ20+772jbxtN+1kAdbfdhDLNFXRGl5miUY4Z27Krz5HdS+zg8aUaDoMDhhEBj3lxaiWbYYWOqhJ2FIMfnJjvZIDXYMEkiO2U2M/6VZ+Z54f0h4j27QQgvNdzw1pkk3zDXOx13jxcTYFHEk+EMOd5hiZrx46Q4vOF4xVzW9BA==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhijCoqOsolCdsW09QenJHiGPoon0YViZ451/vk+xAHiu+OrE6Xzs680/vz51Op1nO3vkI3IIqt+oF3nIYH7Wcg5yaYmOWWePWStZBTV2xckAcXaCqTRR9dPW8qZNp58rnhAYfOqNSjCiUOogiQ7pwKSVU4uu/Ou+TLSOWaTBHBUbZPlO0ru9V08f2sTrMMCMPuqfTmcK7dkoYP9DZZpCeAp4tcYmSg4lBsCeIDzkCVppISGXmHyFQH/smAnFUQqPiooTNb4mNqPgVtgkSqv1GY5Dp7CKtFqGwNxFgzhX13GzUqtE3YCIUuvJ7bzB6hNdrtfVHYQ6vdHWyfvG5JXJJwIDAQAB/vk+xAHiu+OrE6Xzs680/vz51Op1nO3vkI3IIqt+oF3nIYH7Wcg5yaYmOWWePWStZBTV2xckAcXaCqTRR9dPW8qZNp58rnhAYfOqNSjCiUOogiQ7pwKSVU4uu/Ou+TLSOWaTBHBUbZPlO0ru9V08f2sTrMMCMPuqfTmcK7dkoYP9DZZpCeAp4tcYmSg4lBsCeIDzkCVppISGXmHyFQH/smAnFUQqPiooTNb4mNqPgVtgkSqv1GY5Dp7CKtFqGwNxFgzhX13GzUqtE3YCIUuvJ7bzB6hNdrtfVHYQ6vdHWyfvG5JXJJwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8090/estore";
																										 

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl =  
			"https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
   /* public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
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
    }*/
}

