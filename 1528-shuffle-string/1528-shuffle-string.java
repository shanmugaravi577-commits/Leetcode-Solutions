class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            map.put(indices[i], s.charAt(i));
        }
        String st = "";
        for (int i = 0; i < n; i++)
            st += map.get(i);
        return st;

    }
}