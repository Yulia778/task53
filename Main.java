package com.metanit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
            Max num = new Max("Thread 1");

            System.out.println(num);

            Thread a = new Thread(new Max("Thread 1"));
            Thread b = new Thread(new Max("Thread 2"));
            Thread c = new Thread(new Max("Thread 3"));
            Thread d = new Thread(new Max("Thread 4"));
            Thread e = new Thread(new Max("Thread 5"));
            Thread f = new Thread(new Max("Thread 6"));
            Thread g = new Thread(new Max("Thread 7"));
            Thread h = new Thread(new Max("Thread 8"));
            Thread i = new Thread(new Max("Thread 9"));
            Thread j = new Thread(new Max("Thread 10"));
            a.start();
            b.start();
            c.start();
            d.start();
            e.start();
            f.start();
            g.start();
            h.start();
            i.start();
            j.start();


        }
}
