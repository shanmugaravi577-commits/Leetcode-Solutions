class Solution {
    public int missingMultiple(int[] nums, int k) {
     int n=nums.length;
   List<Integer>l=new ArrayList<>();
   for(int i=0;i<n;i++)l.add(nums[i]);
   for(int i=1;i<=n+1;i++)
   {
    
     if(!l.contains(k*i))return k*i;
   }
    return 0;
    }
}