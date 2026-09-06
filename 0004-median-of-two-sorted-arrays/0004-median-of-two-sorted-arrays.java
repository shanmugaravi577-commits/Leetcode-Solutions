class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> st = new ArrayList<>();
        int n=nums1.length;
        int m= nums2.length;
        int i=0,j=0;
        while(i!= n && j !=m)
        {
            st.add(nums1[i++]);
            st.add(nums2[j++]);
            
        }
       if(i!=n)
       {
        while(i!=n)
        {
            st.add(nums1[i++]);
        }
       }
       if(j!=m)
       {
        while(j!=m)
        {
            st.add(nums2[j++]);
        }
       }
       System.out.println(st);
    st.sort(Comparator.naturalOrder());  
    int size =n+m;
    int mid = size/2;
    if(size %2==0)
     return (double)(st.get(mid)+st.get(mid-1))/2;
     else
      return (double)st.get(mid);


    }}