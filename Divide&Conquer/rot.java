public class rot {
    public static int search (int arr[], int tar ,int si , int ei  ){
        if(si>ei){
            return -1;
        }
        //kaam 
        int mid = si +(ei-si)/2;
    //case Found
        if(arr[mid] == tar){
            return mid;
        }
        //mid in l1
        if(arr[si] <= arr[mid]){
            // case  a:left
            if(tar >= arr[si] && tar <= arr[mid]){
                return search(arr,tar,si,mid-1);
            }
            else{
                return search(arr,tar,mid+1,ei);
            }
        }
        //mid  on l2
        else{
            // case target lies in right
            if(tar >= arr[mid] && tar <= arr[ei]){
                return search(arr,tar,mid+1,ei);
            }
            else{
                return search(arr,tar,si,mid-1);
            }
        }

    }
    public static void main(String[] args){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int tarIdx = search(arr,target,0,arr.length-1);
        System.out.println(tarIdx);
    }
    
}
