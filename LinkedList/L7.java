public class L7 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node addend(Node head,int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return head;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            temp.next.next=null;
            return head;
        }
        public static Node RemoveNode(Node head,int pos){
            if(head==null){
                return null;
            }
            Node temp=head;
            int count=0;
            while(temp!=null &&count<pos){
                temp=temp.next;
                count++;
            }
            temp.next=temp.next.next;
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
        head=Node.addend(head,40);
        head=Node.addend(head,30);
        head=Node.addend(head,45);
        head=Node.addend(head,55);
        head=Node.RemoveNode(head,3);
        Node.display(head);
    }
}
