class Solution {
    public int[] finalPrices(int[] prices) {

      int n= prices.length;
     Stack<Integer> stk = new Stack<>();
     int arr[] = new int[n];
     for(int i=n-1;i>=0;i--)
     {

        while(! stk.isEmpty() && stk.peek()> prices[i])
         stk.pop();
        if(!stk.isEmpty() && (stk.peek()==prices[i]||stk.peek()!=prices[i]))
        arr[i]=prices[i]-stk.peek();
        else
        arr[i]=prices[i];
    
    stk.push(prices[i]);
     }
      return arr;
   
    }
}