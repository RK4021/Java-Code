package com.queue;

public class DynamicQueue <T> implements DynamicQueueInterface<T> {
    private class Node{
        private T item;
        private Node next;

        Node(T item){
            this.item = item;
        }
    }

    private Node first;
    private Node last;
    private int count;

    @Override
    public void enqueue(T item) {
        Node node = new Node(item);
        count++;

        if(last == null){
            first = last = node;
            return;
        }

        last.next = node;
        last = node;
    }

    @Override
    public T dequeue() {

        if(first == null)
            throw new IllegalStateException("Queue is empty");

        T item = first.item;
        first = first.next;
        count--;

        if(first == null)    // resetting the last if first becomes null
            last = null;

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

        else
            return false;
    }

    public void print(){
        Node temp = first;
        while(temp != null){
            System.out.print(temp.item + "->");
            temp = temp.next;
        }
    }
}
