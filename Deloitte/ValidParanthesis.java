import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(validParanthesis(s));
    }

    public static String validParanthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{')
                st.push(ch);
            else {
                if (s.isEmpty())
                    return "Not Valid";

                else if ((ch == ')' && st.peek() == '(') ||
                        (ch == ']' && st.peek() == '[') || (ch == '}' && st.peek() == '{')) {
                    st.pop();
                }
                else
                    return "Not Valid";
            }
        }
        return st.isEmpty() ? "Valid" : "Not Valid";
    }
}
