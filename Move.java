class Solution {
    public void moveZeroes(int[] nums) {
        int counter=0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]!=0){
                nums[counter]= nums[i];
                counter++;
            }
            

        }
        for(int i =counter;i<n;i++){
            nums[i]=0;
        }
        
    }
}
