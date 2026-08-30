class Solution {
    // int min(int a,int b,int c)
    // {
    //     int min=0;
    //     if(a<b && a<c)
    //      min=a;
    //      else if(b<c)
    //      min=b;
    //      else
    //      min =c;
    //     return min;
    // }
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int max=nums[0],min=nums[0],i,j;
        for(i=0;i<n;i++)
        {
            if(nums[i]>max)max=nums[i];
            if(nums[i]<min)min=nums[i];
        }

      for(i=0;i<n;i++)
      {
        if(nums[i]==max)
          break;
      }   
      for(j=0;j<n;j++)
      {
        if(nums[j]==min)
          break;
      }
       System.out.println(min+"\t"+max);
      int front =Math.max(i,j)+1;
      int back = n-Math.min(i,j);
      int both = (Math.min(i,j)+1)+(n-Math.max(i,j));
      System.out.println(front+"\t"+back+"\t"+both);
      return Math.min(Math.min(front,back),both);
    }
}