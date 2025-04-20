package prep.interview.stack;

import java.util.Stack;

public class Expression {

    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (!st.empty() &&
                        ((st.peek() == '(' && s.charAt(i) == ')') ||
                                (st.peek() == '{' && s.charAt(i) == '}') ||
                                (st.peek() == '[' && s.charAt(i) == ']'))) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        String s = "{([])}";
        if (isBalanced(s))
            System.out.println("true");
        else
            System.out.println("false");
    }
}