package Singly_LinkedList;

public class MiddleOfLinkedlist {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    public static Node findMiddleNode(Node head){
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

     public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        MiddleOfLinkedlist obj=new MiddleOfLinkedlist();

         // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        obj.printList(head);

        head=obj.findMiddleNode(head);

        System.out.println("Original List After:");
        obj.printList(head);
    }
}
