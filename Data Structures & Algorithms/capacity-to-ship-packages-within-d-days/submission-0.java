class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = max(weights);
        int right = Arrays.stream(weights).sum();

        while(left<right) {
            int mid = left+(right-left)/2;

            int daysReqd = calculateDaysReqd(weights, mid);

            if(daysReqd<=days) {
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return left;
    }

    public int max(int[] arr) {
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i]> max) {
                max = arr[i]; 
            }
        }

        return max;
    }

    public int calculateDaysReqd(int[] nums, int capacity) {
        int shipment = 0;
        int days = 1;

        for(int num: nums) {
            if(shipment + num <= capacity){
                shipment += num;
            } else {
                days++;
                shipment = num;
            }
        }

        return days;
    }
}