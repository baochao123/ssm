package com.java.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Task1 {
    //@Scheduled(fixedRate =1000)每隔1秒执行一次
   @Scheduled(cron ="0 10 9 * * *")//*：秒，分，时，天，月，周，年（可不写）每隔10秒执行一次，总2秒开始
    public void printData(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
