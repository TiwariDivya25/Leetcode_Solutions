class Solution {
    private boolean isOperator(String token) {
        if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) return true;
        return false;
    }
    private int applyOperator(String token, int a, int b) {
        switch(token) {
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
            default: return a;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens) {
            if(isOperator(token)){
                int b = stack.pop();
                int a = stack.pop();
                int res = applyOperator(token, a, b);
                stack.push(res);
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
        
    }
}