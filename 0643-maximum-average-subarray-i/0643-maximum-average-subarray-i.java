class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length;
        double ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0,j=0;i<n;i++)
        {
sum+=nums[i];

if(i-j+1>k)
{
    sum-=nums[j];
 
    j++;
}
if(i-j+1==k)
{
  
    ans=Math.max((double)sum/k,ans);

}
        }
  return ans;
    }
}