package Queue;

public class QueueX {
    private int front;
    private int rear;
    private int maxSize;
    private int[] QueueArray;
    private int nItems;

    public QueueX(int size){
        front =0;
        rear = -1;
        maxSize = size;
        QueueArray = new int[maxSize];
        nItems = 0;
    }
    public void insert(int j){
        if(rear == maxSize-1){
            System.out.println("Full");
        }else {
            rear++;
            QueueArray[rear]=j;
            nItems++;
        }
    }

    public int remove(){
        if(nItems==0){
            return -99;
        }else {
            nItems--;
            int x = QueueArray[front];
            front++;
            return x;
        }
    }
    public boolean isEmpty(){
        return (nItems==0);
    }
    public boolean isFull(){
        return (rear ==maxSize-1);
    }
}
