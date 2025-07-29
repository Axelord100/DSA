/*
  Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
  find two numbers such that they add up to a specific target number. 
  Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length. 

  Since the array is already sorted, like a binary search, the best course would be to have 2 pointers, 
    one at the end of each side of the array. This will help reduce the time complexity of the method

  In each iteration, check if the sum is <, = or > than the target and from there have 3 possible options:
    - if sum < target. then the lower number is not adding enough => left + 1
    - if sum > target, then the higher numbwe is adding more => right - 1
    - if sum == target, then return the values of the indices

  Time: O(n), since at most, each element is visited once

  Space: O(1), only 2 pointers and an array of 2 indices are used
*/

public int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            sum = numbers[left] + numbers[right];

            if(sum > target)
                right--;
            else if(sum < target)
                left++;
            else {
                left++;
                right++;
                return new int[]{left, right};
            }
        }
        return new int[]{};
    }
