package Stacks;

public class StackX {
    private int maxSize;
    private int[] StackArray;
    private int top;

    public StackX(int maxsize) {
        maxSize = maxsize;
        StackArray = new int[maxsize];
        top = -1;
    }

    public void push(int val) {
        if(top == maxSize-1) {
            System.out.println("Cant Push Stack is Full");
        }else {
            top++;
            StackArray[top] = val;
            //or
            //StackArray[++top]=val;
        }

    }

    public int pop() {
        if(top == -1) {
            System.out.println("-99");
            return -99;
        }else {
            int popval = StackArray[top];
            top--;
            System.out.println("POPED");
            return popval;
        }
    }

    public double peek() {
        if(top == -1) {
            return -99;
        }
        else {
            return StackArray[top];
        }
    }

    public boolean isEmply() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }
}
