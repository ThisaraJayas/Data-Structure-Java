package LinkedList;

public class MainLink {
    public static void main(String[] args){
        Link l1 = new Link(43);
        Link l2 = new Link(23);
        Link l3 = new Link(10);

        l1.next=l2;
        l2.next=l3;


    }
}
