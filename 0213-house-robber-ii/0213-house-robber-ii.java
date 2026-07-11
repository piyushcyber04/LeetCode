class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){return nums[0];}
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
   int []skipfirst=new int[nums.length-1];
   int []skiplast=new int[nums.length-1];
   for(int i=0;i<nums.length-1;i++){
    skipfirst[i]=nums[i+1];
    skiplast[i]=nums[i];

   }
   int ans1=fun(skipfirst);
   int ans2=fun(skiplast);
   return Math.max(ans1,ans2);
    }
int fun(int[]arr){
    int[]dp=new int[arr.length+1];
    Arrays.fill(dp,-1);
    dp[0]=arr[0];
    dp[1]=Math.max(arr[0],arr[1]);
    for(int i=2;i<arr.length;i++){
       
        dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
    }
   return dp[dp.length-2];
}
}