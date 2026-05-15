class Solution {
    public int subarraySum(int[] nums) {
        int i=0,s=0;
        while(i<nums.length){
        for(int st=Math.max(0,i-nums[i]);st<=i;st++){
            s+=nums[st];
        }
        i++;}
        return s;
    }
}