package ReverseStringSTACK;

public class ReverseStack {
    private int top;
    private int maxSize;
    private char[] arrayStack;

    public ReverseStack(int maxSize){
        this.top=-1;
        this.maxSize=maxSize;
        this.arrayStack = new char[maxSize];
    }

    public void push(char x){
        if(top ==maxSize-1){
            System.out.println("Cannot push charArray is Full (StackOverflow)");
        }
        top++;
        arrayStack[top]=x;
    }

    public char pop(){
        if(top ==-1){
            System.out.println("Cannot pop its Empty (StackUnderflow)");
        }
        char ch = arrayStack[top];
        top--;
        return ch;
    }
}
