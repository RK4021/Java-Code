package com.myStack;

public interface Stack<T> {
    T pop();
    T peek();
    void push(T n);
    boolean isEmpty();
    boolean isFull();
    int size();
}
