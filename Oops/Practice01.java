package Oops;

public class Practice01 {
    public static void main(String[] args) {
        BlueCar b = new BlueCar();
        System.out.println();
        System.out.println("count: "+b.count);
    }
}

abstract class Car{

    static{
        System.out.print("1");
    }
public Car(String name) {
    super();
    System.out.print("2");
}
{
    System.out.print("3");
}
}
 class BlueCar extends Car{

    static int count;
    { 
        System.out.print("4");
    }

    BlueCar(){
        super("blue");
        System.out.print("5");
        count++;
    }

}

