// Last updated: 14/07/2026, 14:15:26
class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n + 2];
         fib(n+1, arr);
         return arr[n+1]; 
    }
     static int fib(int n, int[] arr) {
        if (n <= 1) {
            return n;
        }
        if (arr[n] != 0 || n == 0){
            return arr[n];
        
        }else{
            arr[n] = fib(n - 1, arr) + fib(n - 2, arr);
            return arr[n];
        }
    }
}

 