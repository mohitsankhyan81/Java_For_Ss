public class L1{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String arg[]){
        System.out.println("Hello");
        Node first=new Node(10);
        System.out.print(first.data);
    }
}