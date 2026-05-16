class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>=10){
                if(nums[i]%10==digit)
                c++;
                nums[i]/=10;
            }
            if(nums[i]==digit)
            c++;
        }
        return c;
    }
}