package Oops;

public class Encapsulation {
    public static void main(String[] args) {
        Nums n = new Nums();
        n.setNum(20);
        System.out.println(n.getNum());
    }
}
 class Nums {
    private int num ;

    public void setNum(int val){
        this.num = val;
    }

    public int getNum(){
        return this.num;
    }
}
