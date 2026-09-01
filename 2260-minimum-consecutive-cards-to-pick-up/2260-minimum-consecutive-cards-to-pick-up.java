class Solution {
    public int minimumCardPickup(int[] cards) {
       Map<Integer,Integer> map = new HashMap<>();
       int n= cards.length;
    // for(Map.Entry<Integer,Integer> k: map.entrySet())
    //  System.out.println(k.getKey()+"\t"+k.getValue());

 int min =1000000;
 boolean f= false;
 for(int i=0;i<n;i++)
 {
    if(map.containsKey(cards[i]) && map.get(cards[i])<i)
    {
        f=true;
     min=Math.min(min,i-map.get(cards[i])+1);
    }
    map.put(cards[i],i);  
 }
 if(f)return min;
 return -1;

    }
}