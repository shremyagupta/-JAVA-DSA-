
 
 import java.util.*;
// public class ArrayEg {
    /*public static void upadate(int marks[], int nonchangable){
         nonchangable= 10;
        for(int i = 0 ; i<marks.length ;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main (String [] args){
        int marks[] = {97, 98, 99};
         int nonchangable = 5;
        upadate(marks, nonchangable);
        System.out.println(nonchangable);
        for( int i = 0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
       // int marks[] = new int [100];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("length of array="+ marks.length);
       // marks[0]= sc.nextInt();
         //marks[1]= sc.nextInt();
         //marks[2]= sc.nextInt();
         //System.out.println("phy:"+marks[0]);
         //System.out.println("chem:"+marks[1]);
         //System.out.println("maths:"+ marks[2]);
         //marks[2]= 100;// updating
         //marks[2]= marks[2]+1;//
         //System.out.println("maths:"+ marks[2]);
         //int percentage = (marks[0]+marks[1]+marks[2])/3;
         //System.out.println("percentage:" +percentage);

 public class ArrayEg{

    public static int linearSearch(int[] numbers, int keys){
        for( int i = 0 ; i<numbers.length; i++){
            if(numbers[i] == keys) {
                return i;

            }
        }
        return  -1;

    }
     public static void main(String[] args) {
        int numbers[] = { 2, 4,6 ,8,10,12,14}; 
        //String menu[] = { " dosa"," chole bhature"};
        int keys = 20;
        int index = linearSearch(numbers, keys);
        if(index == -1 ){
            System.out.println(" keys not found");
        }
        else{
            System.out.println("keys is at index:"+ index);
        }
     }
 }*/
 import java.util.*;
 public class ArrayEg{
    public static int getLargest(int numbers[]){
         int largest = Integer.MIN_VALUE;
         int smallest = Integer.MAX_VALUE;
         for( int i =0; i< numbers.length; i++){
             if ( largest < numbers[i]){
                largest = numbers[i];
             }
             if(smallest > numbers[i])
             {
                smallest =numbers[i];
             }
         }
         System.out.println("smallest is " +smallest);
         return largest;
        }
         public static void main(String [] args){
            int number[] = {1, 2,4, 7,9,3,5};
            System.out.println("largest is:"+getLargest(number));
         }
    }
 