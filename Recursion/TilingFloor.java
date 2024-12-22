package Recursion;

public class TilingFloor {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("count no. ways tiles can be placed for no. "+num +" is "+waysToTileFloor(num));
    }

    static int waysToTileFloor(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        
        int horizCount = waysToTileFloor(num -2);
        int verticCount = waysToTileFloor(num - 1);

        return verticCount + horizCount;
    }
}
