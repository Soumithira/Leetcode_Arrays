class Solution {
    public int minElement(int[] nums) {
       int []a=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        int s=0;
        int t=nums[i];
        while(t>9){
           s+=t%10;
           t/=10; 
        }
        s+=t;
        a[i]=s;
       } 
       int m=a[0];
       for(int i=1;i<a.length;i++){
        if(m>a[i])
        m=a[i];
       }
       return m;
    }
}