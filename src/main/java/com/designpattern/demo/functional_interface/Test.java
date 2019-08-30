package com.designpattern.demo.functional_interface;

import javafx.scene.media.SubtitleTrack;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        GreetingService greetingService =(message,integer)->{
//            System.out.println(message+integer);
//        };
//        greetingService.sayMessage("我的朋友是呆逼啊",234);
        String message = "sfs";
        Integer integer = 0;
        List<String> list = new ArrayList();
        say(list,(a,b)->{
            //具体的相关实现
            System.out.println(message+integer);
        });
    }

    public static void  say(List<String> list, GreetingService greetingService){
        greetingService.sayMessage("er",343);
        //对编程式接口进行重写
        greetingService = (a,b)->{
            System.out.println(a+b);
        };
        greetingService.sayMessage("er",343);
    }
}
