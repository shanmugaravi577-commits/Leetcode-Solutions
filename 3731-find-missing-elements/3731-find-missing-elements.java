class Solution {
    public List<Integer> findMissingElements(int[] nums) {
      List<Integer>l=new ArrayList<>();
      Arrays.sort(nums);
      int n=nums.length;
    
      int min=nums[0];
      int max=nums[n-1];
      for(int i=min;i<=max;i++)
      {
         if(Arrays.binarySearch(nums,i)<0)
          l.add(i);
      }
    

return l;     
    }
}