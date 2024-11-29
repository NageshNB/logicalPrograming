public class DuplicateInArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,1};
        System.out.println(findDuplicate(arr));
    }

    static boolean findDuplicate(int[] arr){
        for(int i =0; i<arr.length;i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }
}
