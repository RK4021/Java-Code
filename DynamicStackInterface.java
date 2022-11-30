package com.myStack;

public interface DynamicStackInterface <T> {

    T pop();
    T peek();
    void push(T n);
    boolean isEmpty();
    int size();
}
