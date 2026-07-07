import java.util.Stack;

public class ValidParenthesis {

    public static void main(String args[]){

    }


        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            for (char c : s.toCharArray()) {

                if (c == '}' && !st.empty() && st.peek() == '{')
                    st.pop();
                else if (c == ']' && !st.empty()  && st.peek() == '[') {
                    st.pop();
                } else if (c == ')' && !st.empty()  && st.peek() == '(') {
                    st.pop();
                } else {
                    st.push(c);
                }
            }
            return (st.size() == 0);
        }
;}
