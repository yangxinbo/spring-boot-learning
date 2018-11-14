package com.twistedfate;

import org.springframework.stereotype.Component;

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
@Component
public class MqListener {

    public void listen(String jsonParam) {
        System.out.println("收到：" + jsonParam);
    }
}
