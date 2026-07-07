import java.util.*;

public class TopKFrequentNumbers {

    public static void main(String args[]){

        int[] numbersArray = {1,3,4,2,3,4,5,6,3,4,7,3,7,7,7,7,7,7};

        Map<Integer, Integer> counterMap = new HashMap<>();
        for(int i = 0; i < numbersArray.length; i++){
            if(counterMap.get(numbersArray[i]) == null){
                counterMap.put(numbersArray[i],1);
            }else{
                counterMap.put(numbersArray[i],counterMap.get(numbersArray[i]) + 1);
            }
        }


        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<>(Comparator.comparing(Map.Entry::getValue));

        for(Map.Entry entry: counterMap.entrySet()){
            priorityQueue.offer(entry);

            if(priorityQueue.size() > 2){
                priorityQueue.poll();
            }
        }
        System.out.println(priorityQueue);

    }


}
