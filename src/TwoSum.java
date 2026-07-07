import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){

        TwoSum twoSum = new TwoSum();
        int nums[] ={5,5};
        int target = 10;


        System.out.println(twoSum.twoSum(nums, target));

    }


    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        HashMap<Object, Object> abc = new HashMap<>();
        for( int i=0; i < nums.length; i++){
            if(null != abc.get(target - nums[i])){
                result[0] = (int) abc.get(target - nums[i]);
                result[1] = i;
            }else{
                abc.put(nums[i], i);
            }

        }
        return result;
    }
}
