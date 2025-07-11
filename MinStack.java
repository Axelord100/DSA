/*
  Designing a stack that supports push, pop, top and getting the minimum element in constant time. 

  In order to do so, an auxiliary stack will be used, just to store at the same level as the regular
    stack the minimum value. 

    Time: O(1) contant since it´s using the methods of a normal stack

    Space: O(n) in the worst case all elements are stored in both stacks
*/

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack; // Auxiliary stack

    public MinStack() { // Initialization of both stacks
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        /* hecking that ther that the minStack is empty to automatically
            put the value inside it, or checking if it is in fact less than
            wahat there is already stored inside minStack
        */
        if(minStack.isEmpty() || val <= minStack.peek()) 
            minStack.push(val);
        else
            minStack.push(minStack.peek());
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        if(stack.isEmpty())
            return -1;

        return stack.peek();
    }
    
    public int getMin() {
        if(minStack.isEmpty())
            return -1;

        return minStack.peek();
    }
}
