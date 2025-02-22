package Queues;

public class LinkedlistQueue {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }     
    }
    static Node head = null;
    static Node tail = null;

    public boolean isEmpty(){
        return  head == null && tail == null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        int result = head.data;
        if( tail == head){
            head = tail = null;
        }else{
            head = head.next;
        }
        return result; 
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return head.data;
    }

    public static void main(String[] args) {
        LinkedlistQueue llQueue = new LinkedlistQueue();
        llQueue.add(1);
        llQueue.add(2);
        llQueue.add(3);
        llQueue.add(4);
        while (!llQueue.isEmpty()) {
            System.out.println(llQueue.remove());
        }
    }
}
