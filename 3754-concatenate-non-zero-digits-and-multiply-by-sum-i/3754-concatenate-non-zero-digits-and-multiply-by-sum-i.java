class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        int m = s.length();
        long x=0;
        int sum =0;
        for(int i=0;i<m;i++)
        {
            int c = s.charAt(i)-'0';
            if(c != 0)
            {
                x=x*10+c;
                sum+=c;
            }
        }
   
    return x*sum;

    }
}