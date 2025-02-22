package Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJavaFrameWork {
    public static void main(String[] args) {
        // queue is interface which can be implemented by only Linkedlist and ArrayDeque
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);

            while (!q.isEmpty()) {
                System.out.println(q.remove());
            }
        
    }
}
