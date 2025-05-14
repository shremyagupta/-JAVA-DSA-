/*import java.util.Scanner;
public class Assign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        double x = sc.nextDouble();
        System.out.println("Input second number:");
        double y = sc.nextDouble();
        System.out.println("Input thord number:");
        double z = sc.nextDouble();
        System.out.println("The average of value"+ average(x,y,z)+"/n");
    }
    public static double average(double x, double y, double z){
        return (x+y+z)/3;
    }
    }
    
*/
import java.util.*;
public class Assign{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer:");
        num = sc.nextInt();
        if(isEven(num)){
            System.out.println("num is even" );

        }
        else{
            System.out.println("num is odd");
        }
    }
   public static boolean isEven(int number){
    if(number % 2 ==0){
        return true;

    }
    else{
        return false;
    }
   }
   } 

