public double findMaxAverage(int[] nums, int k) {
    int sum = 0;

    // Iterate through the first k elements
    for(int i = 0; i < k; i++)
        sum = sum + nums[i];

    int max = sum;

    // Iterate through the rest of the array
    for(int i = k; i < nums.length; i++) {
        // Substract element that leaves window
        // Add element that enters window
        sum = sum - nums[i - k] + nums[i];

        max = Math.max(max, sum);
    }

    return (double) max / k;
}
