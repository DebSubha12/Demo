package Singly_LinkedList;

public class RemoveEveryKNode {
     public  static class Node{
        int data;
        Node next;

        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node removeNthNode(Node head,int k){
    if(head==null || k<=0)    {
        return head;
    }
    if(k==1){
        return null;
    }
    Node current=head;
    Node prev=null;
    int count=1;

    while(current!=null){
        if(count%k==0){
            prev.next=current.next;
        }else{
            prev=current;
        }
        current=current.next;
        count++;
    }
    return head;
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
        RemoveEveryKNode obj=new RemoveEveryKNode();
         Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("Original list:");
        obj.printList(head);

        head = obj.removeNthNode(head, 3);

        System.out.println("After Removing Every 3rd Node:");
        obj.printList(head);

    }
}
