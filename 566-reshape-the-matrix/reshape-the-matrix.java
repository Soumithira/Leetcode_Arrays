class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res=new int[r][c];
        ArrayList<Integer> rl=new ArrayList<>();
        int e=mat.length*mat[0].length,el=0;
        if(e!=r*c)
        return mat;
        else
        {
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    rl.add(mat[i][j]);
                }
            }
            for(int i=0;i<res.length;i++){
                for(int j=0;j<res[i].length;j++){
                    res[i][j]=rl.get(el++);
                }
            }
        }
        return res;
    }
}