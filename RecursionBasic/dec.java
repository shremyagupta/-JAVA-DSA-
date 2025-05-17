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
    

// power
public static int power(int x , int n){
    if (n==0 ){
        return 1;
    }
    int xnm1 = power(x ,n-1);
    int xn = x * xnm1;
    return xn;
    // return x* power(x, n-1);
}

//optimze power
public static int optimizePower(int a , int n){
    if( n == 0){
        return 1;
    }
     int halfPowerSq = optimizePower(a , n/2)* optimizePower(a , n/2);
    // odd
    if(n% 2 != 0 ){
        halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;

}

//or
public static int optimizePowernew(int a , int n){
    if( n == 0){
        return 1;
    }
     int halfPower = optimizePower(a , n/2);
     int halfPowerSq = halfPower * halfPower;
    // odd
    if(n% 2 != 0 ){
        halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

//Tilting code
public static int tilingProblem(int n){//2*n (floor size)
    //base case
    if(n == 0 || n==1){
        return 1;
    }
    //vertical case
    int fnm1= tilingProblem(n-1);
    //horizntal case
    int fnm2 = tilingProblem(n-2);
    //total ways
    int toWays = fnm1 +fnm2;
    return toWays;
}

    //remove duplicate
public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean[] map){
    if(idx ==str.length()){
        System.out.println(newStr);
        return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar - 'a']==true){
        removeDuplicate(str, idx+1, newStr, map);
    }
    else{
        map[currChar - 'a']= true;
        removeDuplicate(str, idx+1, newStr.append(currChar),map);
    }

}//

//friend pairing
public static int friendPairing(int n){
    if(n == 1||n ==2){
        return n;
    }
    //single
     int fnm1 = friendPairing(n-1);

     //pair
     int fnm2 = friendPairing(n-2);
     int pairWays = (n-1) * fnm2;

     //totWays
     int totWays = fnm1 + pairWays;
     return totWays;
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
  // int arr[] = { 6,3,5,2,6,5,7};
   //System.out.println (lastOccurance( arr,0,6));

   //int a = 2;
   //int n = 5;
    //System.out.println(optimizePower(a , n));
    //System.out.println(optimizePowernew(a,n));
    //System.out.println(tilingProblem(2 ));
    //String str = "appnnacollege";
   // removeDuplicate(str, 0,  new StringBuilder(""), new boolean[26]);
    System.out.println(friendPairing(3));



}
}





    