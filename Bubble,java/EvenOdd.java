public class EvenOdd {
    public static void evenOdd(int n){
        int bitMask =1;
        if((n& bitMask) ==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static int getIthBit(int n , int i){
        int bitMask =1<<i;
        if((n&bitMask)==0){
            return 0;
        }
            else{
                return 1;
            }
        }
        public static int setIthBit(int n, int i){
            int bitMask = 1<<i;
            return n | bitMask;
        }
        //public static int clearIthBit(int i , int n){
           // int bitMask = ~(1<<i);
           // return n & bitMask;
        //}
        public static int clearIthBit(int n , int i){
            int bitMask = ~(0<<i);
            return n & bitMask;
        }
        public static int clearIthBitinRange(int i, int j, int n){
            int a = ((~0)<<(j+1));
            int b = (1<<i)-1;
            int bitMask = a|b;
            return n & bitMask;
        }
        public static boolean powerOf2(int n){
            return (n &(n-1))  == 0;
        }
        public static int countSet(int n){
            int count =0;
            while(n>0){
                if((n&1)!=0){
                    count++;
                }
                n = n>>1;
            }
            return count;
        }
    public static void main(String [] args){
       // evenOdd(7);
        //evenOdd(18);0));
     System.out.println(countSet(15));
}
}