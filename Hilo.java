package com.tokioschool;

import java.util.Random;
import java.util.stream.IntStream;

public class Hilo extends Thread {
    @Override
    public void run() {
        Random random = new Random();

        IntStream.range(0,10).forEach(number -> {
            System.out.println(number);
            try {
                Thread.sleep(100* random.nextInt(7));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
