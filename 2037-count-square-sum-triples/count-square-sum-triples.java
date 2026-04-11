class Solution {
    public int countTriples(int n) {
        int cn=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int s=(i*i)+(j*j);
                int c=(int)Math.sqrt(s);
                if(c*c==s && c<=n)
                cn++;
            }
        }
        return cn;
    }
}