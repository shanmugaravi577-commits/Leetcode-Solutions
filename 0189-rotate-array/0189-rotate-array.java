class Solution {
   void reverse(int a[],int s,int e)
   {
       int j=e-1;
        System.out.println((s+e)/2);
       for(int i =s;i<(s+e)/2;i++)
       {
          int c = a[i];
          a[i]= a[j];
          a[j]=c;
          j--;
       }
   }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        System.out.println(n+" "+k);
        reverse(nums,0,n);
        reverse(nums,0,k);
        reverse(nums,k,n);
        
    }
}