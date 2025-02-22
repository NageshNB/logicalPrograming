package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
     static class Queue {
        static Deque<Integer> d = new LinkedList<>();
        
        static boolean isEmpty(){
            return d.isEmpty();
        }
         
        static void add(int data){
            d.addLast(data);
        }

        static int remove(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            return d.removeFirst();
        }

        static int peek(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            return d.getFirst();
        }
     }
     public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
     }
}
