public class Testin2 {

    public static void main(String args[]){
        String s = "apple";
        char[] ca = new char[26];
        for (char c : s.toCharArray()) {
            ca[c - 'a']++;
        }
                ca[2] = (char) (ca[2] + 100);
        String keyStr = String.valueOf(ca);


        System.out.println(keyStr);
    }
}
