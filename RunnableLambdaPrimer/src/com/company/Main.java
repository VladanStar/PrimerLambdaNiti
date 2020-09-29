package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(Thread.currentThread().getName() + " RunnableTest");
        
        // Runnable kao Anonimna klasa
        Runnable zadatak1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " se izvrsava");

            }
        };
        // Prosledjivanje Runnable pri kreiranju nove niti
        Thread nit2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " se izvrsava");
            }
        }
        );
        // Lambda Runnable
        Runnable zadatak3 = () -> {
            System.out.println(Thread.currentThread().getName() + " se izvrsava");
        };
        Thread nit1 = new Thread(zadatak1);
        nit1.start();
        nit2.start();
        new Thread(zadatak3).start();
    }

}
