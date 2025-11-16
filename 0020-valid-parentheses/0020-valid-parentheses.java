class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')', '(');
        hm.put(']', '[');
        hm.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(!hm.containsKey(c)){
                stack.push(c);
            }
            else { 
                if(stack.empty()){
                    return false;
                }
                char popped = stack.pop();
                if(popped != hm.get(c)) {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}