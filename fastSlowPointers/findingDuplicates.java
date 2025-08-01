/* First try brute force

  Time: O(n)
  Space: O(n)
*/
public int findDuplicate(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int left = 0;
    int right = nums.length - 1;

    while(left <= right) {
        if(left != right) {
            map.put(nums[left], map.getOrDefault(nums[left], 0) + 1);
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
        }
        else
            map.put(nums[left], map.getOrDefault(nums[left], 0) + 1);

        if(map.get(nums[left]) > 1)
            return nums[left];
        
        if(map.get(nums[right]) > 1)
            return nums[right];

        left++;
        right--;
    }
    return 0;
}

/*
  Time: O(nlogn)
  Spcace: O(logn)
*/
public int findDuplicate(int[] nums) {
    Arrays.sort(nums);

    for(int i = 1; i < nums.length; i++) {
        if(nums[i] == nums[i - 1])
            return nums[i];
    }
    
    return 0;
}
