/*public class Smart1{
    public static void main(String args[]){
        int n=4;
        for(int line=1; line<=n;line++){
            for(int star=1; star<=line; star++)
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}*/
  /*class Smart1 { 
    public static void main(String args[]){ 
        int n= 4;
        for(int line= 1; line<=n;line++)
        {
          for(int star=1;star<=n-line+1;star++){
            System.out.println( "*");
          }
          System.out.println();
        }
}
 }
/*public class Smart1 {
    public static void main(String args[]){
        int n =4;
        for(int line =1; line<=n;line++){
            for(int number =1; number<=line;number++){
                System.out.println(number);
            }
            System.out.println();
        }
    }  
    
}*/
/*public class Smart1 {
    public static void main(String args[]) {
        int n = 4;
        for (int line = 1; line <= n; line++) { // Outer loop for rows
            for (int number = 1; number <= line; number++) { // Inner loop for numbers
                System.out.print(number + " "); // Print the number with a space, no newline
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
*/
/*class Smart1{
public static void main(String args[]){
    int n= 4;
    char ch='A';
    for(int line=1; line<=n;line++){
        for(int chars =1; chars<=line; chars++){
            System.out.print(ch +" ");
            ch++;
        }
        System.out.println();
    }
}
}*/
// function/method
//import java.util.*;
/*public class Smart1{
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    } 
    public static int calculateSum(int a, int b){
        int sum =a+b;
        return sum;

}
 public static void swap(int a, int b){
    int temp = a;
         a=b;
         b=temp;
         System.out.println("a=" +a);
         System.out.println("b=" +b);
 }
    public static void main(String args[]){
        int a=5;
        int b=10;
         
         swap(a,b);
        
        
    }
} 
// find the product of the value
//import java.util.*;
public class Smart1{
    public static int multiply(int a, int b){
        int product = a*b;
        return  product;

    }
    public static void main(String[] args) {
        
        int a = 4;
        int b = 3;
        int product = multiply(a, b);
        System.out.println("a*b: "+product);
        product = multiply(10,3);
        System.out.println("a*b="+product);
    }
}
//Factorial of a number
import java.util.*;
public class Smart1{
    public static int factorial(int n){
        
        int f = 1;
        for(int i = 1; i<= n; i++){
             f = f* i ;
        }
    return f;
    }
    public static void main(String []args){
        System.out.println(factorial (4));

    }
}
//Binomial Coefficient
import java.util.*;
public class Smart1{
    public static int factorial(int n){
        
        int f = 1;
        for(int i = 1; i<= n; i++){
             f = f* i ;
        }
    return f;
    }
        public static int binCoeff(int n , int r){
            int fact_n = factorial(n);
            int fact_r= factorial(r);
                    int fact_nmr = factorial(n-r);
                    int binCoeff = fact_n/(fact_r * fact_nmr);
                return binCoeff;
            }
           
            public static void main(String [] args){
        System.out.println(binCoeff(5,2));
            }
                    
        }
    

*/
/* 
/// function oveloading using parameters
 import java. util.*;
 public class Smart1{
    public static int sum(int a, int b){
    return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(5,2,1));
    }
}


 function overloading using parameters
import java.util.*;
public class Smart1 {
    public static int sum(int a , int b){
        return a+b;
    }  
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String [] args){
        System.out.println(sum(3,5));
        System.out.println(sum( 3.2f, 4.3f));
}
}

import java.util.*;
public class Smart1{
        public static boolean isPrime(int n){
     //if (n ==1)
            for(int i = 2; i<n-1; i++);
            {
                if( n % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.println(isPrime(5));
    }
}
    
    import java.util.*;

public class Smart1 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 and numbers <= 0 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Check up to the square root of n
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        return true; // n is prime
    }

    public static void main(String args[]) {
        System.out.println(isPrime(5)); // Expected output: true
    }
}

import java.util.*;
public class Smart1{
    public static boolean isPrime(int n){
        if (n ==2){
            return true;
        }
       for(int i = 2; i<=Math.sqrt(n); i++)
       {
        if (n% 2==0 ){
            return false;
        }
    }
    return true;
}
public static void main(String[] args) {
    System.out.println(isPrime(6));
}
/
import java.util.*;
public class Smart1 {
 public static void PrimesInRange(int n){
    for (int i = 2; i<= n; i++){
        if(isPrime(i)){
            System.out.println(i+" ");
        }
    }
    System.out.println();
 }
    public static void main(String[] args) {
        primesInRange(20);
    }
}
import java.util.*;

public class Smart1 {
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Check divisors up to the square root
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        return true; // n is prime
    }

    // Method to print all prime numbers in the range [2, n]
    public static void PrimesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // Print the prime number
            }
        }
        System.out.println(); // Print a newline after the list of primes
    }
    public  static void binToDec(int binNum){
        int myNum = binNum;
        int pow= 0;
        int decNum = 0;
        while(binNum >0){
            int lastDigit = binNum % 10;
            decNum = decNum +(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;

        }
        System.out.println("decimal of " +myNum +" =" +decNum);
    }
    public static void decToBin(int n){
        int myNum =n;
        int pow = 0;
        int binNum=0;
        while (n>0) 
        { int rem = n%2;
            binNum = binNum +( rem*(int) Math.pow(10,pow));
            pow++;
            n= n/2;
            
        }
        System.out.println("binary form of"+myNum +"="+binNum);
    }
    public static void main(String[] args) {
        int p =98;
        {
            int s = 33;
        }
        System.out.println(s);
        System.out.println(p);

       // decToBin(4);
        //binToDec(111);
        //PrimesInRange(20); // Call the method with n = 20
    }
}

*/
//import java.util.*;
