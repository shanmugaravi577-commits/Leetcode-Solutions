class Solution {
  


    public List<Integer> findMissingElements(int[] nums) {
      List<Integer> l = new ArrayList<>();
      List<Integer> res = new ArrayList<>();
      int n= nums.length;
      int min =nums[0],max =nums[0];
      for(int i=0;i<n;i++)
      {if(nums[i]<min)min=nums[i];
      if(nums[i]>max)max=nums[i];
        l.add(nums[i]);
      }
   
  
    for(int i=min;i<=max;i++)
    {
        if(!l.contains(i))
        res.add(i);
    }

return res;
            
         
    }
}