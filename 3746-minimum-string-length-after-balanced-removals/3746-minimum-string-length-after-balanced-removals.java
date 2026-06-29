class Solution {
    public int minLengthAfterRemovals(String s) {
        int ac=0,bc=0;
        for(char k:s.toCharArray())
        {
          
            if(k == 'a')
             ac++;
            else
             bc++;
        }
    return Math.abs(ac-bc);
    }
}