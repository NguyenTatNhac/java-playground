package com.ntnguyen.udemy.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerPlayground {

    public static void main(String[] args) {
        int initiateValue = 0;
        AtomicInteger atomicInteger = new AtomicInteger(initiateValue);
        atomicInteger.getAndIncrement(); // i++
        atomicInteger.incrementAndGet(); // ++i
    }
}
