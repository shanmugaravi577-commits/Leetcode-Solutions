class Solution {


    public String reversePrefix(String s, int k) {
        int n = s.length();
        char[] c = s.toCharArray();
        int i=0,j=k-1;

        while(i<j)
        {
            char ch = c[i];
            c[i] = c[j];
            c[j] =ch;
            i++;
            j--;
        }
    return new String(c);

    }
}