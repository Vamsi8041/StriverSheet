class FindLength{
    public static void main(String[] args) {
        Createll.head = new Node(10);
        Createll.head.next = new Node(20);
        Createll.head.next.next = new Node(30);
        Createll.insertBeg(5);
        Createll.insertEnd(40);
        System.out.println("Length of the linked list: " + findLength(Createll.head));
    }

    public static int findLength(Node head) {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}