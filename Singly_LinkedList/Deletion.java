package Singly_LinkedList;

public class Deletion {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Create linked list using recursion
    static Node createLinkedList(int arr[], int index, int size) {
        if (index == size) {
            return null;
        }

        Node temp = new Node(arr[index]);
        temp.next = createLinkedList(arr, index + 1, size);
        return temp;
    }

    // Method to delete first node
    static Node deleteFirst(Node head) {
        if (head == null) {
            return null; // list is empty
        }

        return head.next; // move head to next node
    }

    // Print list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10};

        Node head = createLinkedList(arr, 0, arr.length);

        // Call delete method
        head = deleteFirst(head);

        // Print updated list
        printList(head);
    }
}