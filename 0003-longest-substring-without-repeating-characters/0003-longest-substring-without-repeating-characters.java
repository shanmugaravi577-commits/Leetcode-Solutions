class Solution {
    public int lengthOfLongestSubstring(String s) {
       Stack<Character> stk = new Stack<>();
       Map<Character,Integer> map = new HashMap<>();
       char c[]=s.toCharArray();
       int n=s.length();
       int max=0;
       int j=0;
       for(int i=0;i<n;i++)
       {
         if(map.containsKey(c[i]))
         {
            max=Math.max(max,stk.size());
            
            while(!stk.isEmpty())
            {
                stk.pop();
                
            }
            map.clear();
            i= ++j;
            stk.push(c[i]);
            map.put(c[i],1);
            continue;
         } 
        else
        {
                stk.push(c[i]);
                map.put(c[i],1);
        }
       }
       max=Math.max(max,stk.size());
    
    return  max;

    }
}