/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* resultArray(int* a, int n, int* returnSize) {
    
    int i=2,j=0,k=0,p=0;

    int* a1=(int*)malloc(100*sizeof(int));
     int* a2=(int*)malloc(100*sizeof(int));
     int* r=(int*)malloc(200*sizeof(int));
    a1[j++]=a[0];
    a2[k++]=a[1];
   for(i=2;i<n;i++)
    {
        if(a1[j-1]>a2[k-1])
         a1[j++]=a[i];
        else
         a2[k++]=a[i];
    }
       
   for(i=0;i<j;i++)
     r[p++]=a1[i];
    for(i=0;i<k;i++)
     r[p++]=a2[i];
      *returnSize=j+k;
    return r;

}