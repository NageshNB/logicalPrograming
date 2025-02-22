package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack{
        static Deque<Integer> d = new LinkedList<>();

        static boolean isEmpty(){
            return d.isEmpty();
        }

        static void push(int data){
            d.addLast(data);
        }

        static int pop(){
            return d.removeLast();
        }

        static int peek(){
            return d.getLast(); 
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
