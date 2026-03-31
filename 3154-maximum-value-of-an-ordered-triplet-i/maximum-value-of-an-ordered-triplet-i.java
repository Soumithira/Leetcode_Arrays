class Solution {
    public long maximumTripletValue(int[] nums) {
        long c,m=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-3;i++){
            for(int j=i+1;j<=nums.length-2;j++){
                for(int k=j+1;k<nums.length;k++){
            c=(long)(nums[i]-nums[j])*nums[k];
            if(c>m)
            m=c;
        }}}
        if(m<0)
        return 0;
        return m;
    }
}