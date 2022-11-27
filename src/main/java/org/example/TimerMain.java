package org.example;

import java.util.Timer;

public class TimerMain {

    public static void main(String[] args){

        Timer t = new Timer();
        var consumer = new OrderConsumer();
        t.scheduleAtFixedRate(consumer, 0, 10000);
    }
}
