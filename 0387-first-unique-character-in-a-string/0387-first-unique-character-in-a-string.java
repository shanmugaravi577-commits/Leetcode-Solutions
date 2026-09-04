class Solution {
    public int firstUniqChar(String s) {
       char c[] = s.toCharArray();
       int n=s.length();
       int f=0;
       int count=0;
       for(int i=0;i<n;i++)
       {
        f=0;
          for(int j=0;j<i;j++)
          {
            if(c[i]==c[j])
            {
                f=1;
                break;
            }
          }
        if(f==0)
        {
           count =0;
           for(int j=0;j<n;j++)
             if(c[j]==c[i])
               count++;
                   System.out.println(c[i]+" "+i+" "+count);
        if(count ==1)return i;
        }

       }
    return -1;
    }
}