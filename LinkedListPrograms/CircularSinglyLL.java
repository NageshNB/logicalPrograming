package LinkedListPrograms;

public class CircularSinglyLL {
    static class Node {
        int data;
        Node next;        
    }

    static Node addToEmpty(Node last,int data){
        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        return last;
    }

    static Node addFirst(Node last, int data){
        if(last == null){
            return addToEmpty(last, data);
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    static Node addLast(Node last, int data){
        if(last == null){
            return addToEmpty(last, data);
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    static Node addAfter(Node last, int data, int key){
        if(last == null){
            System.out.println("CLL is empty");
            return last;
        }

        Node temp = last.next;
        do{
            if(temp.data == key){
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = temp.next;
                temp.next = newNode;
                if(temp == last){
                    last = newNode;
                }
                return last;
            }
            temp = temp.next;
        }
        while (temp != last.next);
        System.out.println(key + "The given node is not present in the list");
        return last;

    }

    static Node deleteNode(Node last, int key){
        if(last == null){
            System.out.println("CSLL os empty");
            return last;
        }
        if(last.data == key  && last.next == last){
            last = null;
            return last;
        }

        Node temp = last, d = new Node();
        if(last.data == key){
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
            return last;
        }
        while (temp.next != last && temp.next.data != key) {
            temp = temp.next;
        }
        if(temp.next.data == key){
            d = temp.next;
            temp.next = d.next;
        }
        return last;
    }

    static void printLL(Node last){
        if (last == null) {System.out.println("List is empty.");return;}
        Node temp = last.next;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        while(temp != last.next);
        System.out.println();
    }
     public static void main(String[] args) {
        Node last = addFirst(null, 4);
         last = addFirst(last, 3);
         last = addFirst(last, 2);
         last = addFirst(last, 1);
        printLL(last);
        last = addLast(last, 5);
        last = addLast(last, 6);
        printLL(last);
        last = deleteNode(last,4);
        printLL(last);
        last = addAfter(last, 4, 3);
        printLL(last);
        last = addAfter(last, 7, 6);
        printLL(last);
    }
}
