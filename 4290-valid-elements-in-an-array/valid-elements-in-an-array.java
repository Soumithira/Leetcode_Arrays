class Solution {
    public List<Integer> findValidElements(int[] nums) {
        ArrayList <Integer> res=new ArrayList<>();
        if(nums.length>=1)
            res.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            int in=i-1;
            boolean f=true;
            while(in>=0){
                if(!(nums[i]>nums[in])){
                    f=false;
                    break;
                }
                else
                    in--;
            }
            if(f){
                res.add(nums[i]);
                continue;}
            in =i+1;
            f=true;
            while(in<nums.length){
                if(!(nums[i]>nums[in])){
                    f=false;
                    break;
                }
                in++;
            }
            if(f)
                res.add(nums[i]);
        }
        return res;
    }
}