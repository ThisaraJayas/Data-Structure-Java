package Queue;

public class MainQueue {
    public static void main(String[] args){
        QueueX que1 = new QueueX(5);
        QueueX que2 = new QueueX(5);

        que1.insert(45);
        que1.insert(12);
        que1.insert(75);
        que1.insert(54);

        int val =que1.remove();
        System.out.println(val);

    }
}
