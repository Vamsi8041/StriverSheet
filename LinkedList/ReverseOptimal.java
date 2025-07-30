class ReverseOptimal{
    static Node head;
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void Reverse(){
       Node temp=head;
       Node prev=null;

       while(temp!=null){
           Node front = temp.next;
           temp.next=prev;
           prev=temp;
           temp=front;
       } 
       head=prev;
    }
    public static void main(String[] args){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(10);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Reverse();
        printLinkedList(head);
    }
}