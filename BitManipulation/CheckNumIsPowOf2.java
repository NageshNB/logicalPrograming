package BitManipulation;

public class CheckNumIsPowOf2 {
    
    public static void main(String[] args) {
        System.out.println(checkNumIsPowOfTwo(2));
    }

    static boolean checkNumIsPowOfTwo(int num){
        return (num & (num-1)) == 0;
    }
}
