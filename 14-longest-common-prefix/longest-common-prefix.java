class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        if(strs.length==1)
        return strs[0];
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            boolean cp=false;
            for(int j=1;j<strs.length;j++){
                if(i<strs[j].length() && c==strs[j].charAt(i)){
                    cp=true;
                }
                else
                {
                    cp=false;
                    break;
                }
            }
            if(cp)
            res+=c;
            else
            return res;
        }
        return res;
    }
}