package com.mr.util;

/**
 * Created by yangx on 2019/8/29.
 * 发送各种手机验证码
 */
public class MessageUtil {

    /*public static String voiceSend() {
        // just replace key here
        Client client = Client.create();
        client.addFilter(new HTTPBasicAuthFilter(
                "api", "key-e47b4a1e729c697b22def2cfa29a2e17"));
        WebResource webResource = client.resource(
                "http://voice-api.luosimao.com/v1/verify.json");
        MultivaluedMapImpl formData = new MultivaluedMapImpl();
        formData.add("mobile", "");
        formData.add("code", "321123");
        ClientResponse response = webResource.type(MediaType.APPLICATION_FORM_URLENCODED).
                post(ClientResponse.class, formData);
        String textEntity = response.getEntity(String.class);
        int status = response.getStatus();
        //System.out.print(textEntity);
        //System.out.print(status);
        return textEntity;
    }


    public static String msgSend(String msgCode, String phoneNum, HttpServletRequest req) {
        // just replace key here
        System.out.println(phoneNum);
        Client client = Client.create();
        client.addFilter(new HTTPBasicAuthFilter(
                "api", "key-02865cfa3ee28aa099a236ef411e70a5"));
        WebResource webResource = client.resource(
                "http://sms-api.luosimao.com/v1/send.json");
        MultivaluedMapImpl formData = new MultivaluedMapImpl();
        formData.add("mobile", phoneNum);
        formData.add("message", "验证码：" + msgCode + "【铁壳测试】");
        ClientResponse response = webResource.type(MediaType.APPLICATION_FORM_URLENCODED).
                post(ClientResponse.class, formData);
        String textEntity = response.getEntity(String.class);
        int status = response.getStatus();
        // 将验证码放入session中
        req.getSession().setAttribute(CommonConstant.MSG_CODE, msgCode);
        //System.out.print(textEntity);
        //System.out.print(status);
        return textEntity;
    }*/

}
