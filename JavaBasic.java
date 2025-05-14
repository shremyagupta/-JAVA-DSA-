
//import java.util.*;

//import java.util.Scanner;

 //class JavaBasic{


  //public static void main(String args[]){
   /*  Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int i =1;
    while(i<=n){
      sum+=i;
      i++;
    }
    System.out.println(sum);
  ;*///for loop
  /*for(int i =1; i<=10;i++){
    System.out.println("hello");
  }
*/
/*for(int i = 1;i<=4;i++)
{
  System.out.println("* * * *");
}
*/
//by while loop
 /*int i = 1;
 while (i<=4) {
  System.out.println("****");
  i++;
  
 }
  */
  //reverse number
  /*int n = 10899;
  while (n>0) {
   int lastDigit = n% 10;
   System.out.println(lastDigit);
   n= n/10; 
  }
  System.out.println();
  //reverse for gibven num of reverse order
  */
  /*int n=2314344;
  int rev =0;
  while (n>0) 
  {
    int lastDigit = n% 10;
    rev = (rev*10)+lastDigit;
    n=n/10;
  }
 System.out.println(rev);*/
 //do while loop
/*int counter=1;
do{
  System.out.println("hello world");
  counter++;
} while(counter<=10);*/
//break statement
/*for(int i =1; i<=5;i++){
  if(i==3){
    break;
  }
  System.out.println(i);
}
System.out.println("i am out of the loop");*/
//keep entering the number till user enters the multiple of 10
 /*Scanner sc = new Scanner(System.in);
 do{
  System.out.println("enter your number");
  int n =sc.nextInt();
  if(n%10==0)
  {
    break;
  }
  System.out.println(n);
 }while(true);*/
//continue statement/
/* 
for(int i = 1; i<=5;i++){
  if(i==3){
    continue;
  }
  System.out.println(i);
}*/
// display all the number entered by the user except multiple of 10
/*Scanner sc = new Scanner(System.in);
do{
  System.out.println("enter the number:");
int n = sc.nextInt();
if (n %10==0){
  continue;
}
System.out.println(n);
}while(true);*/
//prime number or not
/*Scanner sc= new Scanner(System.in);
int n =sc.nextInt();
 if (n==2)
 {
  System.out.println(" n is a prime");
 }
 boolean isPrime = true;
 for( int i = 2; i<= n-1; i++)
 {
  if (n% i ==0)
  {isPrime = false;}
 }
  if(isPrime == true)
  {
    System.out.println("n is prime number");
  }
  else System.out.println(" n is not a prime number");
*/
//question
/* 
for ( int i = 0; i<5 ; i++)
{
  System.out.println("hello");
  i+=2;
}*/
//nested loop
/*for (int line =1; line <=4; line++)
{
  for (int star = 1;star<=line; star++){
    System.out.println("*");
  }
  System.out.println();
}
  }*/
  // prime or not prime number 
  /*Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  boolean isPrime = true;
  for(int i =2; i<=Math.sqrt(n);i++){
    if(n%i ==0){
      isPrime= false;
    }
  }
  if(isPrime == true)
  {
    System.out.println("N IS PRIME");
  }else{
    System.out.println("N IS NOT PRIE NUMBER");
  }
}


public static void main(String args[])
{
  for (int line = 1; line<= 4; line++)
  {
    for (int star=1; star<= line; star++)
    {
      System.out.println("*");
    }
  }

public class JavaBasic{
  public static void invert_pyramid(int n){
      for( int i =1; i<=n; i++){
          for (int j =1 ; j<= n-i; j++){
              System.out.print(" ");
          }
          for (int j = 1; j<=i; j++){
              System.out.print("*");
          }
      System.out.println();
  }
}
public static void inverted_half_pyrimid(int n){
  for ( int i = 1; i<= n ; i++){
    for(int j = 1 ; j<=n-i+1; j++){
      System.out.print(j+" ");
    }
    System.out.println();
  }
}
public static void floyds_triangle(int n){
  int counter = 1;
  for (int i = 1;i<=n; i++){
    for(int  j= 1; j<= i ; j++){
      System.out.print(counter+" ");
      counter++;
    }
    System.out.println();
  }
}
public static void triangle(int n){
  for(int i =1 ; i<= n; i++){
    for(int j = 1; j<=i; j++){
      if( (i+j)% 2 == 0){
        System.out.print("1"+" ");
      }
      else{
        System.out.print("0"+" ");
      }
    } 
    System.out.println();
  }
}
*/
public class JavaBasic{
public static void butterfly(int n){
  for(int i = 1; i<=n; i++){
    for (int j =1; j<= i ; j++){
      System.out.print("*");
    }
    for(int j = 1; j<=2*(n-i); j++){
      System.out.print(" ");
    }
    for(int j = 1; j<= i; j++){
     System.out.print("*");
    }
  System.out.println();
  }
  for(int i = n ; i>=1; i--){
  for (int j =1; j<= i ; j++){
      System.out.print("*");
    }
    for(int j = 1; j<=2*(n-i); j++){
      System.out.print(" ");
    }
    for(int j = 1; j<= i; j++){
     System.out.print("*");
    }
  System.out.println();
  }
}
public static void solid_rhombus(int n){
  for(int i = 1; i <= n; i++){
    for(int j = 1 ; j<= (n-i); j++){
      System.out.print(" ");
    }
    for (int j=1; j<= n; j++){
      System.out.print("*");
    }
    System.out.println();;
  }
}
public static void hollow_rhombus(int n){
  for(int i = 1; i<= n ; i++){
    for( int  j = 1; j<= (n-i); j++){
      System.out.print(" "); 
    }
    for(int j =1; j<=n ; j++){
      if(i == 1 || i==n|| j==1||j==n){
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}
public static void diamond(int n){
  for ( int i = 1; i<= n; i++){
     for ( int j = 1; j<=(n-i);j++){
      System.out.print(" ");
     }
     for( int j = 1; j<= (2*i)-1; j++){
      System.out.print("*");
     }
  System.out.println();
    }
  
  for ( int i=n-1; i>= 1; i--){
    for( int j=1; j<=(n-i); j++){
      System.out.print(" ");
    }
    for( int j = 1; j<=(2*i)-1; j++){
      System.out.print("*");
    }
  System.out.println();
  }
}

  public static void main(String[] args) {
      //invert_pyramid(4);
      //inverted_half_pyrimid(5);
      //floyds_triangle(5);
      //triangle(5);
     // butterfly(4);
     //solid_rhombus(5);
    // hollow_rhombus(5);
    diamond(4);
    
  }
}














































































































    /* 
    int counter = 1;
    while(counter  <=10)
    {
      System.out.println(counter +" ");
      counter++;

    }
        /* 
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter weak number 1-7:");
    int week = scanner.nextInt();
    switch (week) {
      case 1: System.out.println("monday");
        
        break;
        case 2:System.out.println("tuesday");
        break;
        case 3:
        System.out.println("wednesday");
        break;
        case 4:System.out.println("thursday");
        break;
        case 5: System.out.println("friday");
        break;
        case 6: System.out.println("saturday");
        break;
        case 7: System.out.println("sunday");
    
      default:System.out.println("no");
        break;
    }
    /* 
    double temp = 78;
    if (temp>100){
      System.out.println("you have fever");
    }
    else{
      System.out.println("you dont have fever");
    }
  
    /* 
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x>0){
      System.out.println("x is positive");
    }
    else{
      System.out.println("x is negative");
    }
    /* 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a :");
    int a = sc.nextInt();
    System.out.println("enter b :");
    int b = sc.nextInt();
    System.out.println("enter operator : ");
    char operator = sc.next().charAt(0);
    switch(operator){
      case'+': System.out.println(a+b);
      break;
      case'-': System.out.println(a-b);
      break;
      case'*': System.out.println(a*b);
      break;
      case'/': System.out.println(a/b);
      break;
      case'%':System.out.println(a%b);
      break;
      default:System.out.println("wrong answer");
    }



    /* //termary operator
    int marks =23;
    String status= (marks>=33)?"pass":"fail";
    System.out.println(status);





    /* //ternary operator
    int number = 7;
     String type =((number%2)== 0) ? "even": "odd";
     System.out.println(type);
    /* 


      Scanner sc = new Scanner(System.in);
      int income = sc.nextInt();
      int tax;
      if(income<500000){
        tax = 0;
      }
      else if (income >= 500000 && income < 1000000)
      {
        tax = (int) (income*0.2);
      }
      else {
        tax = (int)( income*0.3);
      }
      System.out.println("your tax is :"+tax);

      
      
      /* 
      int a = 10;
      int b = 3;
      if(a>=b){
        System.out.println("a");
      } else{
        System.out.println("b");
      }

      /*int age = 16;
      if(age >= 18){
      System.out.println("voting");
      }
      if (age>13 && age <18)
      { System.out.println("teenager");
    }
      else{
        System.out.println("not voting");
          }


      /*int x , y , z;
      x = y = z = 2;
      x += y;
      y -= x;
      z /= (x+y);
      System.out.println(x+" " +y+ " "+z);       /* 
      int x = 200 , y = 50 , z = 100;
      if( x > y && y >z)
      {
        System.out.println("hello");
      }
      if ( z > y && z < x) {
        System.out.println("java");   
      }
      if((y+200) < x && (y+150) < z)
      {
        System.out.println("hello java");
      }
      /*int exp1 = (x * y / x);
      int exp2 = (x * ( y / x ));
      System.out.println(exp1 + ",");
      System.out.println(exp2);
      //System.out.println(b);

      /*   Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float sum = a+b+c;
        System.out.println("Sum of three numbers is: "+sum);
        float newSum = sum +(0.18f * sum);
        System.out.println("Sum of three numbers after 18% tax is: "+newSum);*/
      // int a = sc.nextInt();
       //int b= sc.nextInt();
     //  int c = a*a;
     //  System.out.println(c);
       //int c = sc.nextInt();
      // int avg= (a+b+c)/3;
      // System.out.println(avg);
      //  System.out.println(product);

//float rad = sc.nextFloat();
//float area = 3.14f *rad * rad;
//System.out.println(area);
  //float a = 23.14f;
  //int b = (int) a;
  //System.out.println(b);
  //char ch = 'a';
  //char ch2 = 'b';
  //int number = ch;
  //int number2 = ch2;
  //System.out.println(number);
  //System.out.println(number2);



        //String input = sc.next();

       // System.out.println(input);
        // String name = sc.nextLine();
         //System.out.println(name);
          //int number = sc.nextInt();
          //System.out.println(number);
         // int check = sc.nextDouble();
          //System.out.println(check);
          //int name = sc.nextShort();
          //System.out.println(name);

        



      /*   System.out.println("* * * * ");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");

*/
/*int a = 10;
int b = 5;
int c = 13;
System.out.println(a);
System.out.println(b);
System.out.println(c);
String name =("Tony and Guys");
System.out.println(name);
a = 40;
System.out.println(a);
a = b;
System.out.println(a);

*/
 /* 
//calulate the sum 
int a = 10;
int b = 45;
int sum = (a+b);
System.out.println(sum);
*/


//boilderplate code