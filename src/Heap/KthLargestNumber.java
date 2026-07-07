package Heap;

import java.util.PriorityQueue;

public class KthLargestNumber {

    public static void main(String[] args){
        KthLargestNumber num = new KthLargestNumber();
        int[] abc = {5,6,7,2,4,5,6,12,6,7,4};
        num.findKthLargest(abc, 3);
    }


        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>((p1, p2) -> p1 - p2);
            for(int i  = 0 ; i < nums.length ; i++){
                pq.offer(nums[i]);
                if(pq.size() > k){
                    pq.poll();
                    System.out.println(pq);
                }
            }
            return pq.poll();
        }

}
