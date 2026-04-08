package Singly_LinkedList;

public class InsertEndUsingRecursion {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Recursive function to create linked list
    static Node createLinkedList(int arr[], int index, int size) {
        if (index == size) {
            return null;
        }

        Node temp = new Node(arr[index]);
        temp.next = createLinkedList(arr, index + 1, size);
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        Node head = createLinkedList(arr, 0, arr.length);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}