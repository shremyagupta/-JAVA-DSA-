public class abst {
    public static void main (String args[]){
        //
        Mustang m = new Mustang();
        
    }
    
}
abstract class Animal{
    //String color;
    Animal(){
        System.out.println("animal constructor called");
        //color ="brown";
    }
    void eat(){
    System.out.println("eat animal");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
       // color = "dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang contructor is called");
    }
}
class Chicken extends Animal
{
void walk(){
    System.out.println("walk on 2 legs");
}
}