package Singly_LinkedList;

public class InsertBeginnig {
  static  class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            if(head==null){
                head=new Node(i);
            }else{
                Node temp=new Node(i);
                temp.next=head;
                head=temp;
            }
        }
        //print

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }
}
