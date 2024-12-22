package Oops;

public class MultipleInheritanceInterface{
    public static void main(String[] args) {
        Beer b = new Beer();
        b.eats();
        b.eats1();
    }
}

interface Carnivores {
    void eats();    
}

interface Herbivores {
    void eats1();    
}

class Beer implements Carnivores, Herbivores {
 public void eats(){
    System.out.println("Carnivores eats non-veg");
 }
 public void eats1(){
    System.out.println("Herbivores eats veg");
 }
}
