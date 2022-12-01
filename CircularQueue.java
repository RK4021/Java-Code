package com.queue;

import java.util.Arrays;

public class CircularQueue <T> implements Queue<T> {

    private int start = 0;
    private int last = 0;
    private int count = 0;
    private int size ;
    private T[] array;

    public CircularQueue(int size){
        this.size = size;
        array = (T[]) new Object[size];
    }
    
    @Override
    public void enqueue(T item) {

        if(count == size)
            throw new IllegalStateException("Queue is full");

        array[last] = item;
        last = (last + 1) % size;
        count++;

    }

    @Override
    public T dequeue() {

        if(count == 0)
            throw new IllegalStateException("Queue is Empty");

        T item = array[start];
        array[start] = null;
        start = (start + 1) % size;
        count--;
        return item;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if(count == 0)
            return true;

        return false;
    }

    @Override
    public boolean isFull() {

        if(count == size)
            return true;

        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
