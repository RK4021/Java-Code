package com.queue;

public class MyQueue<T> implements Queue<T> {
    private int count = 0;
    private int first = 0;
    private int last = 0;
    private T[] array = (T[]) new Object[5];

    @Override
    public void enqueue(T n)  {

        if(count == array.length)
            throw new IllegalStateException("Queue is full") ;

        array[last++] = n;
        count++;
    }
    @Override
    public T dequeue()  {

        if(count == 0)
            throw new IllegalStateException("Queue is empty");

        count--;
        return array[first++];
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

        if(count == array.length)
            return true;

        return false;
    }

    public void print(){

        for(int i = first; i<last; i++){
            System.out.print(array[i] + "->");
        }
   }
}
