public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        // Step 1 - Create new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - Link new node to head
        newNode.next = head;

        // Step 3 - set new head to new node
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        } 

        tail.next = newNode;

        tail = newNode;
    }

    public void addIndex(int index, )

    public void print() {
        if(head == null) {
            System.out.println("Linkedlist is empty!");
            return;
        }
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}