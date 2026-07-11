class Solution {
    void swap(int a[],int p1,int p2)
    {
        int c = a[p1];
        a[p1] = a[p2];
        a[p2] = c;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0,c=0,h=n-1;
        for(;c<=h;c++)
        {
             if( nums[c] == 0)
            {
                swap(nums,l,c);
                
                l++;
            }
           else  if( nums[c] == 2)
            {
                swap(nums,h,c);
                h--;
               c--;
            }
           
          
        }
        
         
    }
}