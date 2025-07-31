public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int maxLength = 0;
    int left = 0;

    for(int right = 0; right < s.length(); right++) {
        char curr = s.charAt(right);
        map.put(curr, map.getOrDefault(curr, 0) + 1);

        while(map.get(curr) > 1) {
            char leftChar = s.charAt(left);
            map.put(leftChar, map.get(leftChar) - 1);
            left++;
        }

        maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
}
