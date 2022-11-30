import com.myStack.DynamicStack;
import com.myStack.MyStack;

public class Main {

    public static void main(String[] args) {
        DynamicStack<Integer> stack = new DynamicStack();
        System.out.println(stack.isEmpty());

        stack.push(100);
        stack.push(2000);
        stack.push(3000);
        stack.push(7000);
        stack.push(2000);
        stack.push(4000);
        stack.push(5000);

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        stack.print();
    }
}


