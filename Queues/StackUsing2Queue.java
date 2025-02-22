package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue {
    // add => O(n)
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        static boolean isEmpty(){
            return q1.isEmpty();
        }

        static void push(int data){
            //pushing add from q1 to q2            
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }            

            //adding data to q1
            q1.add(data);

            //adding back data from q2 to q1
            while(!q2.isEmpty()) {
                q1.add(q2.remove());
            }            
        }  

        static int pop(){
            if(q1.isEmpty()){
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
            return q1.remove();
        }

        static int peek(){
            if(q1.isEmpty()){
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
            return q1.peek();
        }
        
    }
    public static void main(String[] args) {
        Stack2 s = new Stack2();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());

s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    // remove and peek => O(n)
    static class Stack2 {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        static int pop(){
            if(isEmpty()){
                System.out.println("Stock is empty");
                return -1;
            }
            int top = -1;
            //case 1
            if(!q1.isEmpty()){
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{// casse 2
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        static int peek(){
            if(isEmpty()){
                System.out.println("Stock is empty");
                return -1;
            }
            int top = -1;
            //case 1
            if(!q1.isEmpty()){
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            }else{// casse 2
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
        
    }
}
