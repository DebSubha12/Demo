package Doubly_Linklist;

public class RemoveDuplicateElement {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert node at end
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    // Remove duplicate elements (Unsorted Linked List)
    public Node deleteDuplicates(Node head) {
        Node current = head;

        while (current != null) {
            Node temp = current;

            while (temp.next != null) {
                if (current.data == temp.next.data) {
                    temp.next = temp.next.next; // remove duplicate
                } else {
                    temp = temp.next;
                }
            }

            current = current.next;
        }

        return head;
    }

    // Display list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        RemoveDuplicateElement list = new RemoveDuplicateElement();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(50);

        System.out.println("Original Linked List:");
        list.display();

        list.head = list.deleteDuplicates(list.head);

        System.out.println("After Removing Duplicate Elements:");
        list.display();
    }
}