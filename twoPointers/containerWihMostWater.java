/*
  Apply the two pointers technique in order to reduce the time complexity

  Have a pointer start at o and the other one at n - 1

  From there always calculate the area taking into account
    - base = right - left
    - height = min(a[left], a[right])

  Reduce the size of the base depending on the min height
    - if height in left is less => left++
    - if height in right is less => right--

  Time: O(n) since in the worst case, a pointer does not move at all

  Space: O(1) 
*/

public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;

    while(left < right) {
        int area = (right - left) * Math.min(height[left], height[right]);

        maxArea = Math.max(area, maxArea);

        if(height[left] < height[right])
            left++;
        else
            right--;
    }

    return maxArea;
}
