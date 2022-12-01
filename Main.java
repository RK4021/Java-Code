import com.queue.MyQueue;

public class Main {
    public static void main(String[] args)  {

        MyQueue<Integer> myqueue = new MyQueue<>();   // I took size value of 5 for array

        myqueue.enqueue(100);
        myqueue.enqueue(200);
        myqueue.enqueue(300);
        myqueue.enqueue(300);
        myqueue.enqueue(300);

        System.out.println(myqueue.isEmpty());
        System.out.println(myqueue.isFull());

        myqueue.print();

    }

}

