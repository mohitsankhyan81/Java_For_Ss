public class L4 {
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
        public static Node addNode(Node head,int data,int pos){
            Node newNode=new Node(data);
            Node temp=head;
            int count=1;
            if(pos==-1){
                return head;
            }
            while(temp!=null&&count<pos){
                count++;
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
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
        head=Node.addNode(head,45,1);
        Node.display(head);
    }
}
