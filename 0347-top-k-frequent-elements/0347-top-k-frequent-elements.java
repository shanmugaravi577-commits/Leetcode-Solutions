class Solution {
    public int[] topKFrequent(int[] nums, int k) {
Map<Integer,Integer> map =new HashMap<>();
for(int p:nums)
map.put(p,map.getOrDefault(p,0)+1);

List<int[]> l=new ArrayList<>();
for(Map.Entry<Integer,Integer> entry:map.entrySet())
{
    int arr[] =  new int[2];
    arr[0]=entry.getKey();
    arr[1]=entry.getValue();
    l.add(arr);
}
Collections.sort(l,(a,b)->Integer.compare(b[1],a[1]));
int ans[]=new int[k];
for(int i=0;i<k;i++)
{
    int a[]=l.get(i);
    ans[i]=a[0];
}
return ans;
    }
}