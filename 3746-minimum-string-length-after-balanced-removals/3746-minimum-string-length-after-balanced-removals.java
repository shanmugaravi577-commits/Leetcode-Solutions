class Solution {
    public int minLengthAfterRemovals(String s) {
        int n=s.length();
        if(n==1)return 1;
        int ac=0,bc=0;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c == 'a')
             ac++;
            else
             bc++;
        }
    return Math.abs(ac-bc);
    }
}