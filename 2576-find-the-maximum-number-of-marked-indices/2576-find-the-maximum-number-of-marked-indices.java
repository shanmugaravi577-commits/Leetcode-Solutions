class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
       Arrays.sort(nums);
       int n= nums.length;
       int mid = (n+1)/2;
       int c=0;
       int i=0,j=mid;
    while(i<mid && j<n)
       {
          if(2*nums[i] <= nums[j])
          {
           c++;
           j++;
           i++;
          }
          else
        j++;
       }
return c*2;
    }
}