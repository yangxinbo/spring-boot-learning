package com.twistedfate;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * FileName    : com.twistedfate.java
 * Description :
 *
 * @author : Leo
 * @version : 1.0
 * Create Date : 2018/11/13 21:04
 * @Copyright : Sinaif Software Co.,Ltd.Rights Reserved
 * @Company : 海南新浪爱问普惠科技有限公司
 **/
@RestController
public class ProducerController {

    @Autowired
    private SendService service;

    @RequestMapping(value = "/kafka")
    public void send() {
        //发送消息到指定topic
        JSONObject obj = new JSONObject();
        obj.put("time", (new Date()).toString());
        System.out.println("生产者发送：" + obj.toJSONString());
        service.sendMessage(obj.toJSONString());
    }
}
