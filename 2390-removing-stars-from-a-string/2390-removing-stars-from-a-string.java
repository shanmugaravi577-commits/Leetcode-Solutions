class Solution {
    public String removeStars(String s) {
        int n=s.length();
      char[] stk = new char[n];
      int front =-1;
      for(int i =0 ;i<n;i++)
      {
        char c= s.charAt(i);
         if(c != '*')
         stk[++front]=c;
         else
             front--;

          
      }  
      return new String(stk,0,front+1);
    }
}