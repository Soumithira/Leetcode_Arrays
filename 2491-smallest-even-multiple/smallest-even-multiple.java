class Solution {
    public int smallestEvenMultiple(int n) {
      int i=n;
      boolean f=true;  
      while(f)
      {
        if(i%2==0 && i%n==0){
        f=false;}
        else
        i++;
      } 
    return i; 
    }
}