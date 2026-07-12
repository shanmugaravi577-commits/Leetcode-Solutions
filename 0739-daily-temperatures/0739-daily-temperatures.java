class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      int n = temperatures.length;
        Stack<Integer> stk = new Stack<>();
        int arr[] = new int[n];
       
      for(int i = n-1;i>=0;i--)
      {
            while(! stk.isEmpty() && temperatures[stk.peek()] <= temperatures[i])
                stk.pop();
            if(! stk.isEmpty())
            arr[i] = stk.peek()-i;
            else 
             arr[i] =0;
        stk.push(i);
      }
return arr;
    }
}