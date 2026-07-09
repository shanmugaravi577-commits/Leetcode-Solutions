/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* intersection(int* a, int n1, int* b, int n2, int* returnSize) {

    int* c = (int*)calloc(10001, sizeof(int));
    int* d = (int*)malloc(1000 * sizeof(int));
    int i, j, p=0;
    for (i = 0; i < n1; i++)
    {
        for (j = 0; j < n2; j++)
        {
            if (a[i] == b[j])
               c[a[i]]++;
}
}
  for(i=0;i<10001;i++)
    if(c[i]>0)
      d[p++]=i;
*returnSize=p;
return d;
}