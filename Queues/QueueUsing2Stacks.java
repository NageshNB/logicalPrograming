package Queues;

import java.util.Stack;

public class QueueUsing2Stacks {

    //using add method O(n)
    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add O(n)
        public static void add(int data){
            if(isEmpty()){
                s1.push(data);
                return;
            } 

            // push all the data to s2 stack
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // adding data at first
            s1.push(data);

            //move back all the data from s2 to s1 stack
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }        
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return Integer.MIN_VALUE;
            }
            return s1.pop();
        }
        
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return Integer.MIN_VALUE;
            }
            return s1.peek();
        }
        
    }


    public static void main(String[] args) {
        
        // Queue q = new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while (!q.isEmpty()) {
        //     System.out.println(q.remove());
        // }

        Queue2 q2 = new Queue2();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);

        while (!q2.isEmpty()) {
            System.out.println(q2.remove());
        }

    }

    //using pop and peek method O(n)
    public static class Queue2 {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        
        public static void add(int data){
            s1.push(data);
        }

        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }

            // shifting all the elem from s1 to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            //getting first added elem
            int res = s2.pop();

            //moving back the elem froms2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return res;
        }

        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int res = s2.peek();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
             return res;
        }
        
    }

}
