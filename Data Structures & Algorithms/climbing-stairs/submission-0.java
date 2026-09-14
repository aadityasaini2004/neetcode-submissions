class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];

        for(int i=0; i<=n; i++) {
            arr[i] = -1;
        }
        
        return climb(n, arr);
    }

    private int climb(int n, int[] arr) {
        if(n<=2) {
            return n;
        }

        if(arr[n] != -1) {
            return arr[n];
        }

        arr[n] = climb(n-1, arr) + climb(n-2, arr);
        return arr[n];
    }
}
