package Queues;

public class ArrayQueuePart02 {
    public static class Queue{
      public  static int[] arr;
        static int size;
        public  static int rear;
        static int front;
        Queue(int data){
            arr = new int[data];
            size = data;
            rear = -1;
            front = -1;
        }   
        
        public static boolean isEmpty(){
            return rear == -1 && front == -1; 
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Array is full");
                return;
            }
            //front == -1
            if(front == -1){
                front = 0;
            }
            rear = rear+1;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Array is Empty");
                return -1;
            }
            int result = arr[front];
            // only one elem is remaining
            if(front == rear){
                rear = front = -1;
            }else{
                front = (front + 1)%size; // circular rotation
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Array is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }


}
