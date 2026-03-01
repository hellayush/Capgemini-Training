import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    static void main() {
        List<Integer> list = List.of(23,3,4,5,6,7,8,9,8,7,6,53,23,66,77,88,994242);
        Stream<Integer> stream = list.stream();
        //ONE STREAM ONE USE AT A TIME , OTHERWISE ERROR
         boolean allMatch = stream.allMatch(x -> x >=40);
         System.out.println("All greater than 40 " + allMatch);

          boolean anyMatch =list.stream().anyMatch(x -> x>=75);
          System.out.println("Any above 75 :" + anyMatch);

          System.out.println(list.stream().count());
          list.stream().distinct().forEach(System.out::println);

          list.stream().filter(x -> x>=40).forEach(System.out::println);
           Stream<Integer> filter = list.stream().filter(x -> x>=40);

           Optional<Integer> any = filter.findAny();
           list.stream().map(null);
           Stream<Double> precen = list.stream().map(x -> x/10.0);

           Integer[] ar = {234,23,5,3,3,2,353,4,3,4,2,6,4,2,543,423,34};
           Stream<Integer> st2 = Arrays.stream(ar);


    }
}
