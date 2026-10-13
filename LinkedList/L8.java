public class L8{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node addbegin(Node head,int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
            return head;
        }
        public static Node reverse(Node head){
            Node curr=head;
            Node prev=null;
            Node next=null;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }
        public static void display(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
    }
    public static void main(String arg[]){
        Node head=null;
        head=Node.addbegin(head,45);
        head=Node.addbegin(head,56);
        head=Node.addbegin(head,24);
        Node.display(head);
        head=Node.reverse(head);
        Node.display(head);
    }
}