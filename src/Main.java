import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> stringlist = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        Iterator<String> itr = stringlist.iterator();
        while(itr.hasNext()){
            if(itr.next().equals("B")){
                itr.remove();
            }
        }
        System.out.println(stringlist);


        String duplicate = "aaggddddddeeeessddddddddd";
        System.out.println(duplicate.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        System.out.println("ABC".substring(2,3));
    }




}
