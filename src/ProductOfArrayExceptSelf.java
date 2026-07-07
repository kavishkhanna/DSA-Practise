public class ProductOfArrayExceptSelf {

    public static void main(String[] args){
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] nums = {1,3,4,5,3};
        for(int num: productOfArrayExceptSelf.productExceptSelf(nums)){
            System.out.println(num);
        }
//1, 1,3,12, 60
//0,0
    }

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1] * nums[i -1];
        }

        int right = 1;
        for(int j = nums.length - 2; j >= 0; j--){
            right = right * nums[j +1];
            result[j] = result[j] * right;
        }

        return result;
    }



}


