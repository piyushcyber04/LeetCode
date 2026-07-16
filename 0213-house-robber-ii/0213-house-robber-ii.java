class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){return nums[0];}
        if(nums.length==2){return Math.max(nums[0],nums[1]);}
int skipfirst =nums.length-1;
int skiplast=nums.length-1;
int[]sf=new int[skipfirst];
int []sl=new int[skiplast];
for(int i=0;i<nums.length-1;i++){
    sf[i]=nums[i+1];
    sl[i]=nums[i];
}
  return Math.max(fun(sf),fun(sl));
}


int fun(int[]arr){
    
    int dp[]=new int[arr.length];
    Arrays.fill(dp,-1);
    dp[0]=arr[0];
    dp[1]=Math.max(arr[0],arr[1]);
    for(int i=2;i<arr.length;i++){
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
    }
    return dp[dp.length-1];
}

}