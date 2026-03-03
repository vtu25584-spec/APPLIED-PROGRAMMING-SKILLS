class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
       int n=nums.length;
       int[] ans=new int[n];
       int totalsum=0;
       for(int num:nums){
       totalsum+=num;
       }
       int leftsum=0;
       for(int i=0;i<n;i++){
        int rightsum=totalsum-leftsum-nums[i];
        ans[i]=nums[i]*i-leftsum+rightsum-nums[i]*(n-i-1);
        leftsum+=nums[i];
       }
       return ans;
    }
}