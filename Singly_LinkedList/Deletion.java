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

    static Node deleteLast(Node head) {
        // Case 1: empty list
        if (head == null) {
            return null;
        }
        // Case 2: only one node
        if (head.next == null) {
            return null;
        }
        Node curr = head;
        Node prev = null;
        // Traverse to last node
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        // Remove last node
        prev.next = null;

        return head;
    }
 static Node deleteParticularNode(Node head, int x) {

    // Case 1: empty list
    if (head == null) return null;

    // Case 2: delete first node
    if (x == 1) {
        return head.next;
    }

    x--;
    Node curr = head;
    Node prev = null;

    // Traverse safely
    while (x-- > 0 && curr != null) {
        prev = curr;
        curr = curr.next;
    }

    // Case 3: x is out of bounds
    if (curr == null) return head;

    // Delete node
    prev.next = curr.next;

    return head;
}
   

    // Print list
   static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println(" "); // ensures next output starts on new line
}

    public static void main(String[] args) {

    int arr[] = { 2, 4, 6, 8, 10, 20, 30, 35, 50 };

    Node head = createLinkedList(arr, 0, arr.length);

    System.out.print("Original List: ");
    printList(head);

    // Delete first node
    head = deleteFirst(head);
    System.out.print("After Deleting First Node: ");
    printList(head);

    // Delete last node
    head = deleteLast(head);
    System.out.print("After Deleting Last Node: ");
    printList(head);

    // Delete particular node (position x)
    int x = 3;
    head = deleteParticularNode(head, x);
    System.out.print("After Deleting " + x + "rd Node: ");
    printList(head);
}
}