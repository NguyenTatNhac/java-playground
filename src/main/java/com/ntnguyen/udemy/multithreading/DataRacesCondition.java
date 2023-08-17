package com.ntnguyen.udemy.multithreading;

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

        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public synchronized void decrement() {
            count--;
        }

        public int getCount() {
            return count;
        }
    }
}
