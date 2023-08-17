package com.ntnguyen.udemy.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class DataRacesCondition {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        IncrementCounter incrementCounter = new IncrementCounter(counter);
        DecrementCounter decrementCounter = new DecrementCounter(counter);

        incrementCounter.start();
        decrementCounter.start();

        incrementCounter.join();
        decrementCounter.join();

        System.out.println(counter.getCount());
    }

    static class IncrementCounter extends Thread {

        private final Counter counter;

        public IncrementCounter(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        }
    }

    static class DecrementCounter extends Thread {

        private final Counter counter;

        public DecrementCounter(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                counter.decrement();
            }
        }
    }

    static class Counter {

        private AtomicInteger count = new AtomicInteger(0);

        public void increment() {
            count.incrementAndGet();
        }

        public void decrement() {
            count.decrementAndGet();
        }

        public int getCount() {
            return count.get();
        }
    }
}
