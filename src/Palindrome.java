public class Palindrome {
    public static void main(String args[]){

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        String abc = s.toLowerCase();
        for(int frontIndex = 0, backIndex = abc.length() -1 ; frontIndex < backIndex; frontIndex++, backIndex--){
            System.out.println(frontIndex);
            System.out.println(backIndex);
            while(frontIndex < abc.length() && !Character.isLetterOrDigit(abc.charAt(frontIndex))){
                System.out.println("FrontIndex" + frontIndex);
                frontIndex++;
            }

            while(backIndex >=0 && !Character.isLetterOrDigit(abc.charAt(backIndex))){
                System.out.println("backIndex" + backIndex);
                backIndex--;
            }
            System.out.println(frontIndex  + " " + backIndex);
            if(abc.charAt(frontIndex) != abc.charAt(backIndex)){
                return false;
            }

        }

        return true;

    }
}
