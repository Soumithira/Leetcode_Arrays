class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList <Integer> a=new ArrayList<>();
        boolean vis[]=new boolean[nums.length];
        for(int j=0;j<nums.length;j++){
            if(nums[j]==key){
                for(int i=0;i<nums.length;i++){
                    if(Math.abs(i-j)<=k && (!vis[i])){
                    a.add(i);
                    vis[i]=true;}
                }
            }
        }
        return a;
    }
}