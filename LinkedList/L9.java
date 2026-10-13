public class L9{
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
        public static int middleElement(Node head){
            Node fast=head;
            Node slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow.data;
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
        System.out.print(Node.middleElement(head));
    }
}