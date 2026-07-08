class Solution {
    public String reverseOnlyLetters(String s) {
        
        int n = s.length();
        int i=0,j=n-1;
        char c[] = s.toCharArray();
        while(i<j)
        {
         
            if(! Character.isLetter(c[i]))
            {
                i++;
                continue;
            }
            else if(! Character.isLetter(c[j]))
            {
                j--;
                continue;
            }
           
            char temp = c[i];
            c[i] = c[j];
            c[j]=temp; 
            i++;
            j--;
            
        }
    return new String(c);
       
    }
}