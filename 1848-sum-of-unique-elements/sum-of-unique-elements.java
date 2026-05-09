class Solution {
    public int sumOfUnique(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            boolean un=true;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                un=false;
                break;}
            }
            if(un)
            s+=nums[i];
        }
        return s;
    }
}