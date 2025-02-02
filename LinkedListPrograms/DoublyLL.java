package LinkedListPrograms;

public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;            
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printLL(){
        Node temp = head;
         while (temp != null) {
            System.out.print(temp.data +" <-> ");
            temp = temp.next;
         }
         System.out.println("null");
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = null;
            size = 0;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public void reverseDLL(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void main(String[] args) {
        DoublyLL dLL = new DoublyLL();
        dLL.addFirst(4);
        dLL.addFirst(3);
        dLL.addFirst(2);
        dLL.addFirst(1);
        dLL.addLast(5);
        dLL.addLast(6);
        dLL.printLL();
        System.out.println(dLL.removeFirst());
        dLL.printLL();
        System.out.println( dLL.removeLast());
        dLL.printLL();
        dLL.reverseDLL();
        dLL.printLL();

    }
}