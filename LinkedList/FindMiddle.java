import java.util.*; 
class FindMiddle{
    static Node head;
    public static Node MiddleElement(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public static void main(String[] args){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(10);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        Node middle=MiddleElement();
        System.out.println(middle.data);
    }
}