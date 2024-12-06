package BitManipulation;

public class BitOperators {
    public static void main(String[] args) {
        //always use single symbol to use bit wise operators
        //AND operator
        System.out.println(5 & 6 );
        
        //OR Operator
        System.out.println(5 | 6 );

        //XOR operator
        System.out.println(5 ^ 6 );

        //NOT Operator
        System.out.println(~5);

        //to check even or odd
        findEvenOrOdd(3);
        findEvenOrOdd(19);
        findEvenOrOdd(10);

        // get the i th bit
        System.out.println(getIthBit(3,2));

        // set the i th bit 
        System.out.println(setIthBit(4, 1));

        // clear the i th bit
        System.out.println(clearIthBit(10,1));

        // update i th bit
        System.out.println(updateBit(5, 2, 0));
    }

    static int updateBit(int num, int ith, int newBit){
        // if(newBit == 0)
        //     return clearIthBit(num, ith);
        // else return setIthBit(num, ith);
        // or

        num = clearIthBit(num, ith);
        int bitMask = newBit << ith;
        return num | bitMask;
    }

    static int clearIthBit(int num, int ith){
        int bitMask = ~(1 << ith);
        return num & bitMask ;
    }

    static int setIthBit(int num, int ith){
        int bitMask = 1 << ith;

        return num | bitMask;
    }

    static int getIthBit(int num, int ith){
        int bitMask = 1 << ith;
        
        return num | bitMask;
        
    }

    static void findEvenOrOdd(int num){
        int bitMask = 1;

        if((num & bitMask) == 0){
            // for even number
            System.out.println("Even Number");
        }
        else{
            //for odd number
            System.out.println("Odd Number");
        }
    }
}
