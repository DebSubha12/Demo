package Singly_LinkedList;

public class ReverseLinkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node reverseList(Node head){
        Node prev =null;
        Node temp=null;
        Node curr=head;
         while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
         }
         return prev;
    }
    //print Method
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseLinkedlist obj=new ReverseLinkedlist();

         // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        obj.printList(head);

        //call the reverse linklist method
        head=obj.reverseList(head);

         System.out.println("Reversed List:");
        obj.printList(head);
    }
}
