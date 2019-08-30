package com.designpattern.demo.functional_interface;

import javafx.scene.media.SubtitleTrack;

public class Test {

    public static void main(String[] args) {

        GreetingService greetingService =(message,integer)->{
            System.out.println(message+integer);
        };
        greetingService.sayMessage("我的朋友是呆逼啊",234);

    }


    public  void  say(GreetingService greetingService){



    }
}
