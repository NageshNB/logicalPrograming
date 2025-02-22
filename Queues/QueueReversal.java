package Queues;
import java.util.*;

public class QueueReversal {
    public static void queueReversal(Queue<Integer> q){
        Stack<Integer> helper = new Stack<>();

        while(!q.isEmpty()){
            helper.add(q.remove());
        }

        while (!helper.isEmpty()) {
            q.add(helper.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        queueReversal(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
}
