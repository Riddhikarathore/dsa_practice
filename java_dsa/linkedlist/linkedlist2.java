package linkedlist;

class DoublyNode {
    int data;
    DoublyNode prev, next;

    DoublyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    DoublyNode head;

    // Insert at end
    public void insert(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // Display forward
    public void displayForward() {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Display backward
    public void displayBackward() {
        if (head == null) return;

        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}

public class linkedlist2{
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(5);
        list.insert(15);
        list.insert(25);

        System.out.println("Forward:");
        list.displayForward();

        System.out.println("Backward:");
        list.displayBackward();
    }
}

