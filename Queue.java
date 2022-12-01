package com.queue;
public interface Queue <T> {

    void enqueue(T item)  ;
    T dequeue();
    int size();
    boolean isEmpty();
    boolean isFull();

}
