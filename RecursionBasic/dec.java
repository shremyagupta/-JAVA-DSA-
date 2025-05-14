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


public static void main(String[] args) {
    int n =5;
    //fact(5);
    //System.out.println(fact(n));
    System.out.println(calSum(n));
}
}