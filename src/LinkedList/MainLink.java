package LinkedList;

public class MainLink {
    public static void main(String[] args){
        LinkList l1 = new LinkList();
        l1.insertFirst(23);
        l1.insertFirst(24);
        l1.insertFirst(10);
        l1.insertFirst(93);


        l1.deleteFirst();
        l1.displayList();


    }
}
