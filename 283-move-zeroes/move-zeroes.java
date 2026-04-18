class Solution {
    public void moveZeroes(int[] nums) {
        int c=0,e=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[e++]=nums[i];
                c++;
            }
        }
        for(int i=c;i<nums.length;i++)
        nums[e++]=0;
    }
}