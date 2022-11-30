package com.myStack;

public class DynamicStack <T> implements DynamicStackInterface<T>{
    private class Node{
        private T item;
        private Node next;
        private Node prev;
        public Node(T item){
            this.item = item;
            next = null;
            prev = null;
        }
    }
    private int count = 0;
    private Node top;
    private Node first;
    public void push(T item) {
        Node node = new Node(item);
        count++;

        if(top == null){
            top = first = node;
            return;
        }

//        top -----> node
//           <------
//
//   first setting the connection
//   then setting node as the top

        top.next = node;
        node.prev = top;
        top = node;

    }
    @Override
    public T pop() {

         if(top == null)
             throw new IllegalStateException("Stack is empty");

         T item = top.item;
         top = top.prev;
         count--;

         // to handle edge case
         if(top != null)
            top.next = null;
         // if top become null set the first null as well
         if(top == null)
             first = null;

         return item;
    }

    @Override
    public T peek() {

        if(top == null)
            throw new IllegalStateException("Stack is empty");

        return top.item;
    }


    @Override
    public boolean isEmpty() {

        if(top != null)
            return false;

        return true;
    }

    @Override
    public int size() {
        return count;
    }

    public void print(){
        Node temp = first;
        while(temp != null){
            System.out.print(temp.item + "->");
            temp = temp.next;
        }
    }
}
