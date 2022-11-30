import com.myStack.MyStack;

public class Main {

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>(5);

        stack.push("Rahul");
        stack.push("Sooraj");
        stack.push("Sumit");

        System.out.println(stack);
    }
}


