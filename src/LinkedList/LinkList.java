package LinkedList;

public class LinkList {
    private Link first;
    public LinkList(){
        first=null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void displayList(){
        Link current = first;
        while (current!=null){
            current.displayLink();
            current = current.next;
        }
    }

    public void insertFirst(int id){
        Link nlink = new Link(id);
        nlink.next=first;
        first=nlink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first= first.next;
        return temp;
    }
}
