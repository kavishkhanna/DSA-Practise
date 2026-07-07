import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static void main(String[] args){


    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap result = new HashMap();
        for(int i = 0 ; i < strs.length;i++){
            char[] abc = strs[i].toCharArray();
            Arrays.sort(abc);
            if(result.get(abc) == null){
                List alpha = new ArrayList();
                alpha.add(strs[i]);
                result.put(abc, alpha);
            }else{
                List beta = (List) result.get(abc);
                beta.add(strs[i]);
                result.put(abc, beta);
            }
        }
        return null;
    }
}
