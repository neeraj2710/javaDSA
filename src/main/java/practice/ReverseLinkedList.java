package practice;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }

    public static Node reverse(Node head, Node newNode){
        if(head == null){
            return null;
        }
        newNode = reverse(head.next, newNode.next);
        return newNode;
    }

    public static Node revList(Node head){
        if(head == null){
            return null;
        }
        Node newNode = new Node(0);
        reverse(head , newNode);
        return newNode.next;
    }

}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

    }
}
