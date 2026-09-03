class Solution {
    public String frequencySort(String s) {

      Map<Character,Integer> map =new HashMap<>();
     
      char[] c=s.toCharArray();
      for(char k:c)
      map.put(k,map.getOrDefault(k,0)+1);
      StringBuffer sb =new StringBuffer("");
      List<int[]> l =new ArrayList<>();
          for(Map.Entry<Character,Integer> entry:map.entrySet())
      {
         int n = entry.getValue(); 
        int ch= (int)entry.getKey();
       
        l.add(new int[]{ch, n});
      }
      Collections.sort(l,(a,b)->Integer.compare(b[1],a[1]));
     for(int[] p:l)
      {
        int n = p[1]; 
        char ch= (char)p[0];

        for(int i=0;i<n;i++)
         sb.append(ch);    
      }
      System.out.println(sb);
return new String(sb);
    }
}