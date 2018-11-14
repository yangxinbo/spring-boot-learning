package com.twistedfate;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * FileName    : com.twistedfate.java
 * Description :
 *
 * @author : Leo
 * @version : 1.0
 * Create Date : 2018/11/13 21:02
 * @Copyright : Sinaif Software Co.,Ltd.Rights Reserved
 * @Company : 海南新浪爱问普惠科技有限公司
 **/
public interface MySource {

    String OUTPUT = "oooooooo";

    String OUTPUT1 = "myOutputTest1";

    @Output(MySource.OUTPUT)
    MessageChannel output();

}
