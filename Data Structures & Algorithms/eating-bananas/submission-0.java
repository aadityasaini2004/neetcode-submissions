class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = max(piles);

        while(left<right) {
            int mid = left+(right-left)/2;

            long hours = 0;

            for(int pile: piles) {
                hours += (pile+mid-1)/mid;
            }

            if(hours<=h) {
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return left;
    }

    public int max(int[] arr){
        int n = arr.length;
        
        int largest = arr[0];

        for(int i=1; i<n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
