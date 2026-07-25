class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        char c[] =s.toCharArray();
        Arrays.sort(c);
        return  (c[s.length()-1]-'0')*(c[s.length()-2]-'0');
    }
}