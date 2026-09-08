class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int n= nums.length;
      int sum=0;
      double max=Integer.MIN_VALUE;
      for(int i=0,j=0;i<n;i++)
      {
       sum+=nums[i];
       if(i-j+1==k)
       {
        max =Math.max(max,(double)sum/k);
        sum-=nums[j];
        j++;
       }  
      }
  return max;
    }
}