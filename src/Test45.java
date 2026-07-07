//Write a program:
//A=[3,1,5,8] and k=7
//Sample input k=7 Yes, k=10 No, k=0 No?


import java.util.HashSet;

public class Test45 {

    public static void main(String args[]) {
        Test45 test = new Test45();
        System.out.println(test.checkInputExist());
    }


    public static boolean checkInputExist() {
        int[] inputArray = new int[]{3, 1, 5, 8};
        int k = 0;
        HashSet uniqueDifference = new HashSet<>();
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                uniqueDifference.add(Math.abs(inputArray[i] - inputArray[j]));
            }
        }
        return uniqueDifference.contains(k);
    }

}
