public class QuePrac {
    public boolean containsDuplicate(int [] nums){
        for(int i = 0 ; i<nums.length-1; i++){
            for (int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
 public static void main(String args[]){
    QuePrac q = new QuePrac();
    System.out.println(q.containsDuplicate( new int[]{1,1,2,3,2}));
 }   
}
