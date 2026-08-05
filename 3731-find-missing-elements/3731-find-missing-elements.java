class Solution {
    int min(int[] a)
    {
        int min = a[0];
        int n= a.length;
        for(int i=0;i<n;i++)
         if(a[i]<min)
         min=a[i];
    return min;
    }
     int max(int[] a)
    {
        int max = a[0];
        int n=a.length;
        for(int i=0;i<n;i++)
         if(a[i]>max)
         max=a[i];
    return max;
    }


    public List<Integer> findMissingElements(int[] nums) {
      List<Integer> l = new ArrayList<>();
      List<Integer> res = new ArrayList<>();
      int n= nums.length;
      for(int i=0;i<n;i++)l.add(nums[i]);
     
    int min = min(nums);
    int max = max(nums);
  
    for(int i=min;i<=max;i++)
    {
        if(!l.contains(i))
        res.add(i);
    }

return res;
            
         
    }
}