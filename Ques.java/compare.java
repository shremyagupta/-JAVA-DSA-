public class compare {
    public static void main(String args[]){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        //
        if(s1.equals(s3)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
    
}
