package Stacks;

public class MainStack {
    public static void main(String[] args) {
        StackX stack1 = new StackX(5);
        StackX stack2 = new StackX(6);

        stack1.push(40);
        stack1.push(45);
        stack1.push(24);

        stack1.pop();

        double peek=stack1.peek();
        System.out.println(peek);

        boolean empty = stack1.isEmply();
        System.out.println(empty);


    }
}
