package com.myStack;

import java.util.Arrays;

public class MyStack<T> implements Stack<T> {
    private T[] array;
    private int size;
    private int top = 0;
    private int count = 0;

    public MyStack(int n) {
        array = (T[]) new Object[n];
        this.size = n;
    }

    @Override
    public void push(T n) {

        if (count == size)
            throw new IllegalStateException("Stack is full");

        array[top++] = n;
        count++;
    }

    @Override
    public T peek() {
        return array[top - 1];
    }

    @Override
    public T pop() {

        if (count == 0)
            throw new IllegalStateException("Stack is empty");

        T item = array[top - 1];
        array[top - 1] = null;
        top--;
        count--;
        return item;
    }

    @Override
    public boolean isEmpty() {

        if (count < size)
            return true;

        return false;
    }

    @Override
    public boolean isFull() {

        if (count == size)
            return true;

        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
