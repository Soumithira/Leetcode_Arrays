class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            List<List<Integer>> res=new ArrayList<>();
            int min=Integer.MAX_VALUE;
            for(int i=0;i<arr.length-1;i++){
                int diff=arr[i+1]-arr[i];
                if(min>diff){
                    min=diff;
                }
            }
            for(int i=0;i<arr.length-1;i++){
                List<Integer> al=new ArrayList<>();
                if(min==(arr[i+1]-arr[i]))
                {
                    al.add(arr[i]);
                    al.add(arr[i+1]);
                }
                if(!al.isEmpty())
                res.add(al);
            }
            return res;
    }
}