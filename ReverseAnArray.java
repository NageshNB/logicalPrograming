public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,8};
        revArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void revArray(int arr[]){

        int first = 0, last = arr.length-1;
        
        while(first< last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
}
