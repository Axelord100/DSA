class NumArray {

  private int[] prefix;

  private NumArray(int[] nums) {
    prefix = new int(nums.length + 1);

    for(int i = 0; i < nums.length; i++)
      prefix[i + 1] = prefix[i] + nums[i];
  }

  private int sumRange(int left, int right) {
    return prefix[right + 1] - prefix[eft];
  }
}
