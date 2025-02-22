package Stacks;

import java.util.Stack;

public class MaxArrayHistogram {
    
    public static void maxOfHistogram(int[] arr){
        int maxArea = 0;
        int[] nxtSmLft = new int[arr.length];
        int[] nxtSmRght = new int[arr.length];
        Stack<Integer> s = new Stack<>();

       // next smaller left
       for(int i =0; i<arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nxtSmLft[i] = -1;
            }else{
                nxtSmLft[i] = s.peek();
            }
            s.push(i);
       }

       // empty the stack
       s = new Stack<>();

       // next smaller right
       for(int i = arr.length-1; i>= 0; i--){
        while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
            s.pop();
        }
        if(s.isEmpty()){
            nxtSmRght[i] = arr.length;
        }
        else{
            nxtSmRght[i] = s.peek();
        }
        s.push(i);
       }

       //calcul max area
       for(int i=0; i< arr.length;i++){
        int height = arr[i];
        int width = nxtSmRght[i] - nxtSmLft[i] - 1;
        int currArea = height * width;
        maxArea = Math.max(maxArea, currArea);
       }

       System.out.println("max area of Histogram is "+ maxArea);
    }

    public static void main(String[] args) {
        int[]arr = {2,1,5,6,2,3};
        maxOfHistogram(arr);
    }
}
