import java.util.*;
class ReverseBrute{
    static Node head;
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void Reverse(Node head){
        Node temp=head;
        Stack<Integer> stack = new Stack<>();
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;

        }
        temp=head;

        while(temp!=null){
            temp.data=stack.pop();
            temp=temp.next;
        }
        
    }
    public static void main(String[] args){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(10);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Reverse(head);
        printLinkedList(head);
    }
}