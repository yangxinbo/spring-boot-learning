package com.twistedfate;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

/**
 * FileName    : com.twistedfate.java
 * Description :
 *
 * @author : Leo
 * @version : 1.0
 * Create Date : 2018/11/13 14:28
 * @Copyright : Sinaif Software Co.,Ltd.Rights Reserved
 * @Company : 海南新浪爱问普惠科技有限公司
 **/
@EnableBinding(value = {MqSinkI.class})
public class MqSinkReceiver {

    @Autowired
    MqListener mqListener;

    @StreamListener(MqSinkI.INPUT)
    public void messageListen(Message<String> message) {
        System.out.println("收到信息:" + message.toString());
        //处理请求的类，对消息进行处理
        mqListener.listen(message.getPayload());
    }
}
