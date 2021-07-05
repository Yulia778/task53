package com.metanit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


    public class Max implements Runnable {
        private final String name;

        public Max(String name) {
            this.name = name;

        }

        @Override
        public void run() {
            List<Integer> numbers = new ArrayList<>(10);
            for (int i = 0; i < 10; i++) {
                numbers.add(ThreadLocalRandom.current().nextInt(1, 10));}
            Integer max = numbers.get(0);
                for (Integer i:numbers){
                    if (i > max) {
                        max = i;
                    }
                }
                System.out.println(name + "    " + max);

            }
        }
