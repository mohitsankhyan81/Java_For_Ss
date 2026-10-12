public class L2 {
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
        public static void display(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.print("NULL");
        }
    }
    public static void main(String arg[]){
        Node head=null;
        head=Node.addbegin(head,10);
        head=Node.addbegin(head,40);
        Node.display(head);
    }
}
