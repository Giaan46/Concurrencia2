package com.tokioschool;

import java.util.Random;
import java.util.stream.IntStream;

public class OtroHilo implements Runnable{
    @Override
    public void run() {
        Random random = new Random();

        IntStream.range(0,10).forEach(number ->{
            System.out.println(number);
            try{
                Thread.sleep(200 * random.nextInt());
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        });
    }
}
