class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        int n=nums1.length;
        int m= nums2.length;
     for(int i=0;i<n;i++)
     l.add(nums1[i]);
     for(int i=0;i<m;i++)
     l.add(nums2[i]);
     
        
       
    l.sort(Comparator.naturalOrder());  
    int size =n+m;
    int mid = size/2;
    if(size %2==0)
     return (double)(l.get(mid)+l.get(mid-1))/2;
     else
      return (double)l.get(mid);


    }}