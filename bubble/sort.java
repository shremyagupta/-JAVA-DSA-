import java.util.Array;
class sort{
    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[] ={3,6,2,1,8,7,5,3,1};
        for(Integer i=0; i<arr.length;i++){
            for(Intger j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                //swap
                Integer temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
            }
        }
    }
    Array.sort(arr, Collection.reverseOrder());
    printArray(arr);

    }
}