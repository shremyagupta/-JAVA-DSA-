/*import java.util.*;
 public class Reverse
 {
    public static void Reverse(int numbers[]){
        int first = 0, last = numbers.length -1;
        while (first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
public static void main(String[] args) {
    int numbers[] = { 2,4,6,8,10};
    Reverse(numbers);
    for( int i =0; i<numbers.length; i++){
        System.out.print(numbers[i]+" ");

    }
    System.out.println();
}
}
 import java .util.*;
 public class Reverse{
    public static void printPairs(int numbers[]){
        int tp=0;
        for( int i = 0; i<numbers.length; i++){
            int current = numbers[i];
            for ( int j = i+1; j<numbers.length; j++){
            System.out.print("("+current +"," + numbers[j] +")");
            tp++;
        }
        System.out.println();
    }
    System.out.println("total pairs:"+tp);
    }
 public static void main(String[] args){
    int numbers[] ={ 2, 4, 6, 8, 10};
    printPairs(numbers);
 }
}
import java .util.*;
public class Reverse{
    public static  void subArrays(int numbers[]){
         //int ts =0;
         int currSum = 0;
         int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i< numbers.length; i++){
           // int start = i;
            for(int j= i; j< numbers.length; j++){
            currSum = 0;{
               // int end = j;
                
                for(int k = i ; k <= j; k++){
                    currSum += numbers[k];
                    //System.out.print(numbers[k]+" ");
                }
                System.out.print(currSum +" ");
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                //ts++;
//System.out.println();
            }
           System.out.println();
        }
        System.out.println("maxSum :" +maxSum);
    }

    public static void main(String[] args) {

            int numbers[]  ={ 2, 4 , 6, 8 , 10};
            subArrays(numbers);
        }    
}
import java.util.*;

public class Reverse {
    public static void subArrays(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) { // Outer loop for starting index
            for (int j = i; j < numbers.length; j++) { // Inner loop for ending index
                currSum = 0; // Reset current sum for each subarray
                for (int k = i; k <= j; k++) { // Innermost loop to calculate the sum
                    currSum += numbers[k];
                }
                System.out.print(currSum + " "); // Print current subarray sum
                if (maxSum < currSum) {
                    maxSum = currSum; // Update maxSum if a larger sum is found
                }
            }
            System.out.println(); // New line for better readability
        }
        System.out.println("maxSum: " + maxSum); // Print the maximum subarray sum
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2 ,6, -1 ,3 };
        subArrays(numbers);
    }
}
import java. util.*;
public class Reverse{
    public static void maxSum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [ number.length];
        prefix[0] = number[0];
        for ( int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        for( int i = 0; i< number.length ; i++){
            int start = i;
            for( int j = i ; j< number.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[ start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

    S
    System.out.println("maxSum is : "+ maxSum);
}
public class Reverse{
public static  void kadanes(int number[]){
    int ms = Integer.MIN_VALUE;
     int cs =0;

    for( int i =0 ; i<number.length; i++){
        cs = cs+ number[i];
        if(cs<0){
            cs=0;
        }
        ms= Math.max(cs,ms);
    }
    System.out.println(" our max subarry sum is : "+ms);
}
 public static void main(String[] args) {
    int nnumber[] = { -2, -3, 4, -1,-2,1,5,-3};
    kadanes(number);
 }
}*/
class Reverse {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    public static  int maxSubarraySum(int[] arr) {

        int ms= Integer.MIN_VALUE;
        int cs =0;
        for( int i = 0; i<arr.length; i++)
        {
            cs = cs + arr[i];
            ms = Math.max(cs,ms);
            if(cs<0){
                cs =0;
            }
            
        }
        System.out.println("our max subarray:"+ms);
        return ms;
    }
 
    public static void main(String[] args){
        int arr[] ={2, 3, -8, 7, -1, 2,3};
        maxSubarraySum(arr);
    }
}









