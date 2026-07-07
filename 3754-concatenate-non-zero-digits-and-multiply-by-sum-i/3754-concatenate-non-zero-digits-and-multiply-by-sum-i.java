class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)
           return 0;
        String s=String.valueOf(n);
        String newstring=s.replace("0","");
        long m=Long.valueOf(newstring);
        long p=m;
     
         long sum=0;
        while(p!=0)
        {
            long r=p%10;
            sum+=r;
            p/=10;
        }
    
        long res=m*sum;
        return res;

    }
}