public class sup {
    public static void main (String [] args){
        Horse h = new Horse();
    }
    
}
class Animal{
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        //per();
        System.out.println("Horse constructor is called:");
    }
}