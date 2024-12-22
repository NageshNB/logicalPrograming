package Recursion;

public class FriendsPairing {
    public static void main(String[] args) {
        int num = 4;
     System.out.println(checkFriendsPair(num));   
    }

    static int checkFriendsPair(int num){
        if(num == 1 || num == 2){
            return num;
        }

        return checkFriendsPair(num - 1)+(num-1)*checkFriendsPair(num - 2);
    }
}
