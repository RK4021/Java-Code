import com.queue.CircularQueue;
import com.queue.MyQueue;

public class Main {
    public static void main(String[] args)  {

        CircularQueue<Integer> circularQueue = new CircularQueue(5);

        circularQueue.enqueue(100);
        circularQueue.enqueue(200);
        circularQueue.enqueue(300);
        circularQueue.enqueue(400);
        circularQueue.enqueue(500);

        System.out.println(circularQueue.isFull());

        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();

        circularQueue.enqueue(300);
        circularQueue.enqueue(400);
        circularQueue.enqueue(500);

        System.out.println(circularQueue);


    }

}

