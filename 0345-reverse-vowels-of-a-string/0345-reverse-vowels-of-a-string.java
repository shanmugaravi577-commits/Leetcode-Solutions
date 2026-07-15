class Solution {
    boolean isVowel(char c)
    {
        char ch = Character.toLowerCase(c);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch =='u';
    }
    public String reverseVowels(String s) {
        
        int n=s.length();
        char c[] = s.toCharArray();
        
        int i=0,j=n-1;
        while(i<j)
        {
            char f = Character.toLowerCase(c[i]);
            char l = Character.toLowerCase(c[j]);
            if(! isVowel(f))i++;
            else if(! isVowel(l))j--;
            else
            {
                char ch = c[i];
                c[i] =c[j];
                c[j] =ch;
                i++;
                j--;
            }
        

        }
        return new String(c);
    }
}