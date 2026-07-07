package String;

import java.util.*;

class GroupAnagram {

    public static void main(String[] args){
        GroupAnagram groupAnagram = new GroupAnagram();
        String[] strArray = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("---------------");
        System.out.println(groupAnagram.groupAnagrams(strArray));
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapOutput = new HashMap<>();
        for(int i = 0 ; i < strs.length;i++){
         char[] abc =  strs[i].toCharArray();
         Arrays.sort(abc);
         System.out.println(abc);
         String key = new String(abc);
         if(mapOutput.get(key) == null){
             System.out.println("value " + String.valueOf(abc));
             List<String> listadd = new ArrayList<>();
             listadd.add(strs[i]);
             mapOutput.put(key, listadd);
         }else{
             System.out.println("value 2" + key);
             List addedList = mapOutput.get(key);
             addedList.add(strs[i]);
         }

        }
        System.out.println("---------------");
        Iterator itr = mapOutput.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("---------------");
        return new ArrayList<>(mapOutput.values());
    }
}