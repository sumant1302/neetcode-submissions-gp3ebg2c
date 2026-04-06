class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        for(char c : s.toCharArray()) {
            if(c == '{' || c == '(' || c == '[') {
                st.push(c);
            } else if(c == '}' || c == ')' || c == ']'){
                if(st.isEmpty()){
                    return false;
                }
                if(st.pop() != map.get(c)) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
