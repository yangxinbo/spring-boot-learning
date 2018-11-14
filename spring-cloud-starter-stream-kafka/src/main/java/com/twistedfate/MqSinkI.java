package com.twistedfate;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

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
public interface MqSinkI {

    public String INPUT = "xxxxxx";

    /**
     * 消费者接口
     *
     * @return org.springframework.messaging.SubscribableChannel 接口对象
     */
    @Input(MqSinkI.INPUT)
    SubscribableChannel input();
}
