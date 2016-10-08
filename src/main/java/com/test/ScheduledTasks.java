package com.test;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 蒋珂 on 2016/8/18.
 *
 * @version 1.0
 */
@Component
public class ScheduledTasks {

    public static String token;

    private int count = 1;

    @Scheduled(fixedDelay = 5000)        //fixedDelay = 5000表示当方法执行完毕5000ms后，Spring scheduling会再次调用该方法
    public void askForToken() {
        /** 发送申请TOKEN请求 */
        String tokenResponse = null;
        tokenResponse = "qwerwer";

        token = tokenResponse;

        System.out.println(String.format("===第%s次获取Token，Token为：%s", count++, tokenResponse));
    }
}
