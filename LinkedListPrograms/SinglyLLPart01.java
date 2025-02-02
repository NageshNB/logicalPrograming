package LinkedListPrograms;

public class SinglyLLPart01 {
    public static class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }        
    }

    public static Node head;
    public static Node tail;
    public static int size;

    void addFirst(int data){ // TC = O(1)
        //step1 - create new node
        Node newNode = new Node(data);
        size++;
        //if head is null
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - newNode.next = head
        newNode.next = head;

        //step3 - head = newNode
        head = newNode;
    }

    void addLast(int data){ // TC = O(1)
        //step1 - create new node
        Node newNode = new Node(data);
        size++;
        //if head is null
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 tail next = newNode
        tail.next = newNode;

        // step3 tail = newNode
        tail = newNode;
    }

    void printLL(){// TC = O(n)
        if(head == null){
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addInMiddle(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp =  temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        else{
            Node prev = head;
            for(int i =0; i< size-2; i++){
                prev = prev.next;
            }

            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;


        }
    }

    int searchKey(int key){
         Node temp = head;
         int idx = 0;

         while(temp != null) {
            if(key == temp.data){
                return idx;
            }
            temp = temp.next;
            idx++;
         }
         return -1;
    }

    int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    int recurSearch(int key){
        return helper(head, key);
    }

    
    void reverseNode(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthNode(int n){
        //calcul size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;// remove first
            return;
        }

        // size - n + 1
        Node prev = head;
        int i = 1;
        int idxToFind = sz - n;
        while(i < idxToFind){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkLLPalindrome(){
        // base condn
        if(head == null && head.next == null){
            return true;
        }
        // step1- find middle node
        Node mid = findMidNode(head);        

        // step2- reverse the 2 half of the node
        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        //step3- check palindrome
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public static void main(String[] args) {
        SinglyLLPart01 ll = new SinglyLLPart01();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(1);

        // ll.addInMiddle(2, 9);
        // ll.printLL();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.printLL();
        // ll.removeLast();
        // ll.printLL();
        // System.out.println(ll.searchKey(3));
        // System.out.println(ll.recurSearch(9));
        ll.reverseNode();
        ll.printLL();
        // ll.deleteNthNode(2);
        // ll.printLL();
        System.out.println(ll.checkLLPalindrome());
    }
    
}
