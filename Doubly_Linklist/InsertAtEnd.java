package Doubly_Linklist;

public class InsertAtEnd {
   static Node head=null;
   //Node class
   public static class Node{
    int data;
    Node prev;
    Node next;
    public Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
   }
   public static void insertEnd(int data){
    if(head==null){
        head=new Node(data);
    }else{
        Node curr=head;
        while (curr.next!=null) {
            curr=curr.next;
        }
        Node temp=new Node(data);
        curr.next=temp;
        temp.prev=curr;
    }
   }
   // Method to display list
    public static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        insertEnd(10);
        insertEnd(15);
        insertEnd(50);
        display();
    }
}
