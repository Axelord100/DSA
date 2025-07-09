/* Brute force implementation 
      Applying two fors, one starting at i = 0 and the other one at j = i + 1 = 1.
      
      The first for will iterate until the previous to last element ensuring the second
        for will iterate until the last element, not counting the same element twice. 

      In case that there is a matching pair adding to the target, the search will stop
        and return an array with positions i and j, respectively. In case that it's not 
        found, returns an empty array. 

      Time: O(n^2) since it's iterating in 2 fors and in worst case the sum are are the 
        2 last elements of the array. 

      Space: O(1) since we're using and array of 2 elements.      
  */
public int[] twoSum(int[] nums, int target) {

  for(int i = 0; i < nums.length() - 1; i++) 
    for(int j = i + 1; j < nums.length(); j++)
      if(nums[i] + nums[j] == target) 
        return new int[]{i, j};
  
  return new int[]{};
}

/* Hash Map implementation 
      In order to be more efficient, we implement a Hash Map to navigate the array once, 
        reducing one for, thus reducing the time complexity to O(n).     

      Time: O(n) since it's iterating one time through the array and comparing if the 
        Hash Map has the complement (key) and its index (Value). 

      Space: O(n) since we're filling a Hash Map with at most n-1 elements of the array.       
  */
public int[] twoSumHM(int[] nums, int target) {

  Map<Integer, Integer> map = new HashMap<>(); // map with array value and index

  for(int i = 0; i < nums.length(); i ++) {
    int complement = target - nums[i];

    if(map.containsKey(complement))
      return new int[]{map.get(complement), i);

    map.put(nums[i], i);
  }
  
  return new int[]{};
}
