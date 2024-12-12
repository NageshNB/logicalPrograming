package BitManipulation;

public class CountSetBits {
    public static void main(String[] args) {
        countBits(1);
    }

    static void countBits(int num){
        int count = 0;
        while(num>0){
            if((num & 1) != 0)
            count += 1;

            num = num >> 1;
        }
        System.out.println(count);
    }
}
