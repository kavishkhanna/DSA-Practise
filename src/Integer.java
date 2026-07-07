import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Integer {

    //Sum no is given suppoes 15
    //find index of 2 numbers whose sum is 15

    //2,3,4,7,8



    public static void main(String args[]){

        int arr[] = {3,4,5,7,8};
        int sum = 9;
//        for(int i = 0 ; i < arr.length -1; i++){
//            for (int j = 0 ; j < arr.length; j++){
//                if(arr[i] + arr[j] == sum){
//                    System.out.println("Index of values is " + i  + " and " + j);
//                }
//            }
//        }


        Map initialValue = new HashMap();

        for(int i = 0 ; i < arr.length ; i ++){

            if(initialValue.get(sum - arr[i]) != null){
                System.out.println("Index of values is " + i  + " and " + initialValue.get(sum - arr[i]));
                break;
            }else{
                initialValue.put(arr[i], i);
            }
        }

    }
}
