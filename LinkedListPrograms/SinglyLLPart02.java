package LinkedListPrograms;

public class SinglyLLPart02 {
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

        public static boolean isCycle(){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast =fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }

        public static void removeCycle(){
            // detect cycle
            Node slow = head;
            Node fast = head;
            boolean cycle = false;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                   cycle = true;
                   break; 
                }
            }

            if(cycle == false){
                return;
            }

            //fing meeting point
            slow = head;
            Node prev = null;

            while(slow != fast){
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            // remove cycle -> last.next = null
            prev.next = null;
            
        }

        static void printLL(){// TC = O(n)
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

        public Node mergeSort(Node head){
            if(head == null || head.next == null){
                return head;
            }
            //find mid
            Node mid = getMid(head);

            //left & right MS
            Node rightNode = mid.next;
            mid.next = null;
            Node left = mergeSort(head);
            Node right = mergeSort(rightNode);

            //merge
            return merge(left, right);

        }

        public Node merge(Node head1,Node head2){
            Node mergedLL = new Node(-1);
            Node temp = mergedLL;

            while(head1 != null && head2 != null){
                if(head1.data < head2.data){
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                }else{
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }

            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }

            while (head2 != null) {
                temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
            }
            mergedLL = mergedLL.next;
            return mergedLL;

        }

        public Node getMid(Node head){
            Node slow = head;
            Node fast = head.next;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }


        public void zigzagNode(){
            // find mid
            Node mid = findMidForZigzag(head);

            // taking right side node separate
            Node right = mid.next;
            mid.next = null;

            //revse right half node
            Node rightNode = reverseNode(right);
            Node leftNode = head;

            //make zigzag
            zigzagMerge(leftNode,rightNode);

        }

        public Node findMidForZigzag(Node head){
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public Node reverseNode(Node rightNode){
            Node prev = null;
            Node curr = rightNode;
            Node next;
             while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
             }
             return prev;
        }

        public void zigzagMerge(Node leftNode, Node rightNode){
            Node nxtLeft, nxtRight;
            while(leftNode != null && rightNode != null){
                //zigzag calcul
                nxtLeft = leftNode.next;
                leftNode.next = rightNode;
                nxtRight = rightNode.next;
                rightNode.next = nxtLeft;

                //update
                leftNode = nxtLeft;
                rightNode = nxtRight;

            }
        }
        public static void main(String[] args) {
            SinglyLLPart02 LL = new SinglyLLPart02();
            head = new Node(1);
            head.next = new Node(6);
            head.next.next = new Node(3);
            head.next.next.next = new Node(7);
            head.next.next.next.next = new Node(5);
            head.next.next.next.next.next = new Node(4);
            head.next.next.next.next.next.next = new Node(2);
            System.out.println(isCycle());
            // removeCycle();
            printLL();
            head = LL.mergeSort(head);
            printLL();
            LL.zigzagNode();
            printLL();
        }
}
