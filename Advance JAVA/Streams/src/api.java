import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class api {
     static void main() {
         Consumer<String> consumer = (str) ->
         {
             System.out.println("This is a cosumer");
             System.out.println("This is a cosumering " + str);

         };
         consumer.accept("SPRING FRAMEWORK");
         List<Integer> list = List.of(4,5,6,7,8,12,24,45);
         list.forEach((x) -> System.out.println("Consuming " + x));
         list.forEach(new Consumer<Integer>() {
             @Override
             public void accept(Integer t) {
                 System.out.println("Consuming" + t);
             }
         });
         list.forEach(System.out::println);

         Function<String,Integer> fun1 = (str) -> str.length();
         Integer len = fun1.apply("Ayush Kumar");
         Function<String ,String> fun3 = (str) -> str.substring(0,2).toUpperCase();
         String n = fun3.apply("Ayush Singh");
         System.out.println(n);


         Supplier<Integer> supplier = new Supplier<Integer>() {
             @Override
             public Integer get() {
                 return new Random().nextInt(400);
             }

         };
          Random random = new Random();
         supplier = () -> new Random().nextInt(400);
         for(int i  =1 ; i <= 10 ; i++)
         {
             System.out.println(supplier.get());
         }
         supplier = random::nextInt;
        Predicate<String> pred = new Predicate<>() {
            public boolean test(String t)
            {
                return t.length()>= 10;
            }
        };

    pred = (str) -> str.length()>= 10;
    Integer[] ar = {23,2,3,4,5,6,7,5,3,443};
    List<Integer> list2 = new ArrayList<>();
    list2.addAll(Arrays.asList(ar));
    list2.removeIf(x -> x >100);
    System.out.println(list2);
     }}

