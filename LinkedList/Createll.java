class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class Createll{
    static Node head;
    public static void main(String[] args) {
       head = new Node(10);
       head.next = new Node(20);
       head.next.next = new Node(30);
       insertBeg(5);
       insertEnd(40);
       DelBeg();
       DelEnd();
       PrintLL(head);
    }
    public static void DelBeg(){
        if(head==null){
            System.out.print("we cant delete the first Element if List Element ");
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        temp=null;

    }
    public static void DelEnd(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void insertBeg(int val){
        Node temp= new Node(val);
        temp.next=head;
        head=temp;
      
    }
    public static void insertEnd(int val){
        Node temp= new Node(val);
        Node n = head;
        while(n.next!=null){
            n=n.next;
        }
        n.next=temp;
      
    }
    public static void PrintLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->"); 
            temp=temp.next;
        }
    }
}
