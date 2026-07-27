class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int bMinus = stack.pop();
                    int aMinus = stack.pop();
                    stack.push(aMinus - bMinus);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int bDiv = stack.pop();
                    int aDiv = stack.pop();
                    stack.push(aDiv / bDiv);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        
        return stack.pop();
    }
}

        
    
