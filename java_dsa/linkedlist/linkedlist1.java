package linkedlist;
import java.util.*;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete a node by value
    public void delete(int key) {
        Node current = head, prev = null;

        // If head node itself holds the key
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the key
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If key was not found
        if (current == null) return;

        // Unlink the node
        prev.next = current.next;
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();  // Output: 10 -> 20 -> 30 -> null

        list.delete(20);
        list.display();  // Output: 10 -> 30 -> null
    }
}
