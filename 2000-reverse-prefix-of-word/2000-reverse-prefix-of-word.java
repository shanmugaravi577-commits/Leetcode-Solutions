class Solution {
    public String reversePrefix(String word, char ch) {
     int n=word.length();
     int m=word.indexOf(ch);
     if(m==-1)return word;

     char a[] = word.toCharArray();
     int j=m;
     for(int i=0;i<=m/2;i++)
     {
        char c = a[i];
        a[i] =a[j];
        a[j]=c;
        j--;
     }

     return new String(a);
    }
}