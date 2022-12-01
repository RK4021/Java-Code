package com.queue;

public interface DynamicQueueInterface <T> {
    void enqueue(T item)  ;
    T dequeue();
    int size();
    boolean isEmpty();
}
