class Solution {
    public int dominantIndex(int[] nums) {
        int m=nums[0],in=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>m){
                m=nums[i];
                in=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=in && nums[i]*2>m)
            return -1;
        }
        return in;
    }
}