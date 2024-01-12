package com.tokioschool;

import java.util.stream.IntStream;

public class Application {
    public static void main(String []agrs){
        System.out.println("Hola");
        Animal animal = new Animal();

        Hilo hilo = new Hilo();
        hilo.start();

        Hilo hilo2 = new Hilo();
        hilo2.start();

        OtroHilo otroHilo = new OtroHilo();
        Thread thread = new Thread();
        thread.start();

         new Thread(animal::hacerAlgo).start();

        try {
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Adios");
    }
}
