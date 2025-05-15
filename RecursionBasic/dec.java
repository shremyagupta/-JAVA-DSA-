package RecursionBasic;

//decreasing
public class dec {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
//Increasing
    public static void printInc(int n){
        if (n==1){
            System.out.println(n+" ");
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }
//Factorial
public static int fact(int n){
    if(n==0){
        return 1;

    }
    int fnm1 = fact(n-1);
    int fn = n * fact(n-1);
    return fn;
}
public static int calSum(int n){
    if(n==1){
        return 1;
    }
    int snm1 =  calSum(n-1);
    int sn = n +snm1;
    return sn;

}
// Calucuate the fibonacci series
public static int fib(int n){
    if(n == 0 || n == 1){
        return n;
    }
    int fnm1 = fib(n-1);
    int fnm2 = fib(n-2);
    int fn = fnm1 + fnm2;
    return fn;
}


//sorted arrray
public static boolean isSorted(int arr[] , int i){
    if (i == arr.length-1){
        return true;

    }
    if(arr[i]> arr[i+1]){
        return false;
    }
    return isSorted(arr, i+1);
}

//First Occurance 
public static int firstOccurance(int arr[] , int i, int key){
    if (i == arr.length){
        return -1;

    }
    if (arr[i] == key){
        return i;

    }
    return firstOccurance(arr,  i+1 , key);
}

//Last Occurance
public static int lastOccurance(int arr[] , int i, int key){
    if (i == arr.length){
        return -1;
    }
    int isFound = lastOccurance(arr, i+1, key);
    if(isFound == -1 && arr[i] ==key){
        return i;
    }
    return isFound;
}
    
    public static void main(String[] args) {
        //fact(5);
    //System.out.println(fact(n));
   // System.out.println(calSum(n));
   //System.out.println(fib(5));
   //System.out.println(fib(23));
   //System.out.println(fib(24));
   //System.out.println(fib(25));
   //System.out.println(fib(26));
   //System.out.println(fib(27));
   //int arr[] = {1,2,3,9,6};
   //System.out.println( isSorted(arr , 0));
   int arr[] = { 6,3,5,2,6,5,7};
   System.out.println (lastOccurance( arr,0,6));

}
}


