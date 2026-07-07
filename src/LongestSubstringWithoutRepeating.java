import java.util.Stack;

public class LongestSubstringWithoutRepeating {

    public static void main(String args[]){

    }

    public int lengthOfLongestSubstring(String s) {
        Stack abc = new Stack();
        int maxLength = 0;
        for(char c: s.toCharArray()){
            if(abc.contains(c)){
                while(!abc.peek().equals(c)){
                    abc.empty();
                }
                abc.pop();
            }else{
                abc.push(c);
                maxLength = Math.max(maxLength, abc.size());
            }
        }
        return maxLength;
    }
}
