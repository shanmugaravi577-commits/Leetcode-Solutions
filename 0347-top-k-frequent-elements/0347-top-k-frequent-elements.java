class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums)
        {
             map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println(map);
     List<int[]> l = new ArrayList<>();
     for(Map.Entry<Integer,Integer> entry:map.entrySet())
     {
        int key = entry.getKey();
        int v= entry.getValue();
        l.add(new int[]{key,v});
     }
     Collections.sort(l,(x,y)->{
        return Integer.compare(y[1],x[1]);
     });
   int [] ans = new int[k];

   for(int i=0;i<k;i++)
    {
        int[] temp = l.get(i);
        ans[i]=temp[0];
    }
return ans;
    }
}