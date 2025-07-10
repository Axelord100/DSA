/*
  Iterating through the whole string pushing to the stack all
    the open parentheses, in the case it's a closing parentheses
    pop the top element of the stack expecting the matching pair

    Stack should be empty at the end 

    3 failing cases:
      - If stack is empty before popping an element
      - If stack doesn't pop the matching pair
      - If stack is not empty at the end

    Time: O(n) in the worst case, we iterated through the complete
      string

    Space: O(n) in the worst case, we have a stack of n items
*/

public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
