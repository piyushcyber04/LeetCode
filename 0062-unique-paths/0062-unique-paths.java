class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return fun(dp,0,0,m,n);
        
    }
    int fun(int[][]dp,int i,int j,int m,int n){
            if(i>=m||j>=n)return 0;
            if(i==m-1&&j==n-1)return 1;
            if(dp[i][j]!=-1){return dp[i][j];}
            int down=fun(dp,i+1,j,m,n);
            int right=fun(dp,i,j+1,m,n);
            return dp[i][j]=down+right;
    }
}