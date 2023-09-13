package CollectionsPractice;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.size());

        stack.pop();
        int k = stack.peek();

        System.out.println(k+" , "+stack.size());
    }
}
