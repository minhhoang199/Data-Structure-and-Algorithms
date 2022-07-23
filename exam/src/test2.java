import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class test2 {
    public boolean isValid(String s) {
        if (s.length() < 2||s.length()%2!= 0) return false;
        if (s.charAt(0) == '}' || s.charAt(0) == ']'||s.charAt(0) == ')') return false;
        Map<Character, Integer> hashtable = new HashMap<>();
        hashtable.put('{', 1);
        hashtable.put('}', 1);
        hashtable.put('(', 2);
        hashtable.put(')', 2);
        hashtable.put('[', 3);
        hashtable.put(']', 3);

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            else{
                if (stack.isEmpty()) return false;
                if (!(hashtable.get(stack.peek()) == hashtable.get(c))){
                    return false;
                }
                stack.pop();

            }
        }
        return stack.isEmpty();
    }
}
