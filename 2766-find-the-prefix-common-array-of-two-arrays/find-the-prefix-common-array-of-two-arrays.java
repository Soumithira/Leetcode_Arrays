class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res=new int[A.length];
        ArrayList <Integer> r=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            int c=0;
            r.add(A[i]);
            for(int j=0;j<=i;j++){
                if(r.contains(B[j]))
                c++;
            }
            res[i]=c;
        }
        return res;
    }
}