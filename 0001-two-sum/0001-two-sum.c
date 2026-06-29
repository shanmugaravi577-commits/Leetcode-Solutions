/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    
     int n=numsSize;
    *returnSize=2;
     int p=0;
    int*a=(int*)malloc(n*sizeof(int));
     for(int i=0;i<n-1;i++) 
      for(int j=i+1;j<n;j++)
         if(nums[i]+nums[j]==target)
            {
               a[p]=i;
               a[p+1]=j;
            }                  
    return a;
}