class Solution {
    int len(int n)
    {
        int c=0;
        while(n!=0)
        {
c++;
n/=10;
        }
        return c;
    }
    public int countCommas(int n) {
        int l = len(n);
        if(l <=3)
         return 0;
       if(n>=1000 && n<=100000)
        return n-1000+1;
    return 0;
    }
}