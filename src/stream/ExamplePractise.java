package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExamplePractise {

    public static void main(String args[]){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream().filter(i -> i%2 ==0).collect(Collectors.toList());


        Integer i = numbers.stream().max(Integer::compare).orElseThrow();

//        List<Integer> sorted = numbers.stream().sorted(Comparator.reverseOrder()).collect();
//        System.out.println(sorted);



        System.out.println(i);
        System.out.println(evenNumbers);



        String input = "asdasdgwelxclvnsldssdf";

       Optional<Character> output =  input.chars().mapToObj(c -> (char) c).filter(j -> input.indexOf(j) == input.lastIndexOf(j)).findFirst();
        System.out.println(output.get());

        List<String> upperCase = Arrays.asList("abc", "adfasdf", "asdfasdf");

        List<String> uuuu = upperCase.stream().map(k -> k.toUpperCase()).collect(Collectors.toList());
        System.out.println(uuuu);


//        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
//        numbers2.stream().

        List<String> words = Arrays.asList("java", "stream", "api", "example", "code", "test");
        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(
                String::length,Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().sorted().collect(Collectors.toList()))
        ));
        System.out.println(collect);

        Map<Integer, List<String>> groupedAndSorted = words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream().sorted().collect(Collectors.toList())
                )));
        System.out.println(groupedAndSorted);



        List employeees = new ArrayList<Employee>();

        employeees.stream().collect(Collectors.groupingBy(Employee::getDepartment));



        String test3 = "sdfasdfadfadfasdfasdf";

        Map<Character, Long> adbc = test3.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("test3: " + adbc);

    }
}

