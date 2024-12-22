package BitManipulation;

public class PowerOfNum {
    
    //fast exponential
    static void findPowOfNum(int num, int pow){
        int ans = 1;

        while(pow>0){
            if((pow & 1) != 0){// check LSB
                ans = num * ans;
            }
            num = num*num;
            pow =pow >> 1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        findPowOfNum(3,5);
    }
}
