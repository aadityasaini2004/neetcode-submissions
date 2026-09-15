class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(0, candidates, target, current, result);
        return result;
    }

    public void backtrack(int index, int[] arr, int target, List<Integer> current, List<List<Integer>> result) {
        if(target == 0 ) {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=index; i<arr.length; i++) {
            if(i>index && arr[i] == arr[i-1]) {
                continue;
            }

            if(arr[i] > target) {
                break;
            }

            current.add(arr[i]);
            backtrack(i+1, arr, target-arr[i], current, result);
            current.remove(current.size()-1);
        }
    }
}
