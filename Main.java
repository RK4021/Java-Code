import com.queue.DynamicQueue;

public class Main {
    public static void main(String[] args)  {

        DynamicQueue<Integer> queue = new DynamicQueue<>();
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

        queue.print();

    }

}

