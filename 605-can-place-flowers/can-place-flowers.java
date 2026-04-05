class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        for(int i=0;i<fb.length;i++){
            if(fb[i]==0){
            if(fb.length==1 && fb[i]==0)
            return true;
            if(i==0 && i+1<fb.length && (fb[i+1]==0)){
                n--;
                i++;
            }
            else if(i+1<fb.length && fb[i+1]==0 && i-1>0 && fb[i-1]==0){
                n--;
                i++;
            }
            else if(i==fb.length-1 && i-1>=0 && fb[i-1]==0 ){
                n--;
            }}
            if(n<1)
            break;
        }
        if(n<1)
        return true;
        return false;
    }
}