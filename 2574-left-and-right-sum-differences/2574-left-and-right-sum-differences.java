class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length,j;
        int[] leftSum = new int[n];
        int[] rightSum=new int[n];
        int ans[] = new int[n];
        leftSum[0]=0;
        rightSum[n-1]=0;
        ;
        for(int i=1;i<n;i++)
        {
             leftSum[i]=nums[i-1]+leftSum[i-1];
             
        }
        for( j=n-2;j>=0;j--)
        {
            rightSum[j]=nums[j+1]+rightSum[j+1];
        }
       for(int i=0;i<n;i++)
       ans[i]=Math.abs(leftSum[i] - rightSum[i]);

return ans;
    }
}