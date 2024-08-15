public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public LinkedList() {
        this.size = 0;
    }

    // Node class
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // Insert at the beginning
    public void insertAtFirst(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at the end
    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtFirst(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
        size++;
    }

    // Insert at a specific index
    public void insertAtIndex(int val, int index) {
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        if (index == size) {
            insertAtLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // Delete from the beginning
    public int deleteFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // Delete from the end
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = getNode(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // Delete from a specific index
    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = getNode(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    // Helper method to get the node at a specific index
    private Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Get the size of the list
    public int getSize() {
        return size;
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method for demonstration
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting elements
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtLast(30);
        list.insertAtIndex(25, 2);

        // Displaying the list
        System.out.println("Linked List:");
        list.display();

        // Deleting elements
        System.out.println("\nDeleted from beginning: " + list.deleteFirst());
        System.out.println("Deleted from end: " + list.deleteLast());
        System.out.println("Deleted from index 1: " + list.deleteAtIndex(1));

        // Displaying the list after deletions
        System.out.println("\nLinked List after deletions:");
        list.display();

        // Displaying the size of the list
        System.out.println("\nSize of the list: " + list.getSize());
    }
}
