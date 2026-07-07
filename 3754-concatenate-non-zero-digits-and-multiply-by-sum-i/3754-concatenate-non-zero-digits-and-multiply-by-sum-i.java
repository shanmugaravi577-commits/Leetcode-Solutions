class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        int m = s.length();
        long x=0;
        int sum =0;
        for(int i=0;i<m;i++)
        {
            char c = s.charAt(i);
            if((c-'0') != 0)
            {
                x=x*10+(c-'0');
                sum+=(c-'0');
            }
        }
   
    return x*sum;

    }
}