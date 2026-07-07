import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args){

        IsAnagram isAnagram = new IsAnagram();
        System.out.println(isAnagram.isAnagram("racecar", "carrace"));
    }

    public boolean isAnagram(String s, String t) {


        if(s.length() != t.length()){
            return false;
        }
        int[] array = new int[26];
        for(int i=0; i < s.length(); i++){
            array[s.charAt(i) - 'a']++;
            array[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < array.length;i++){
            if(array[i] != 0){
                return false;
            }
        }
        return true;
    }

}
