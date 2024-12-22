package Recursion;

public class LastOccurence {

    // static int findLastOccurence(int arr[], int key, int indx){
    //     if(indx < 0){
    //         return indx;
    //     }
    //     if(arr[indx] == key)
    //     return indx;

    //     return findLastOccurence(arr, key, indx-1);

    // }

    static int findLastOccurence(int arr[], int key, int indx){
        if(indx == arr.length){
            return -1;
        }

        int isFound = findLastOccurence(arr, key, indx+1);

        if(isFound == -1 && arr[indx] == key){
            return indx;
        }
        return isFound;
    }
    
    public static void main(String[] args) {
        int arr[]= {1,2,3,3};
        int indx = 0;
        System.out.println("Last occurence is:" + findLastOccurence(arr, 3, indx));
    }
}
