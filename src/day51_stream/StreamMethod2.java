package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod2 {
    public static void main(String[] args) {

        // primitive array to a List
        int[] arr = {3, 4, 1, 5, 15, 4};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        /*
            Arrays.stream(arr) --> converts the array to a stream(int)
            .boxed() --> converts the data from int to Integer -> result is Stream<Integer>
         */

        // list to array

        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 5, 1, 5, 5, 12, 5, 2));
        int [] arr2 = list2.stream().mapToInt(n -> n).toArray();

        /*
        list2.stream() --> converts List to a Stream<Integer>
        .mapToInt(n -> n) --> converts each number to an int type
            IF IT WAS A METHOD: public static int mapToInt(Integer i){
                                    return (int)i;
                                }

         */

        System.out.println("--------------------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(3, 5, 1, 5, 5, 12, 5, 2));
        System.out.println(list3.stream().map(n -> n * 2).collect(Collectors.toList()));
        System.out.println(list3);
        /*
                    IF IT WAS A METHOD: public static int map(Integer i){
                                             return i * 2;
                                        }
         */

        List<String> list4 = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"));
        System.out.println(list4.stream().map(day -> day.substring(0,3).toUpperCase()).collect(Collectors.toList()));

        System.out.println("--------------------------------------------------");

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> evens = list5.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = list5.stream().filter(p -> p % 2 != 0).collect(Collectors.toList());
        System.out.println(evens);
        System.out.println(odd);

        // given some list of numbers find how many were even
        System.out.println(list5.stream().filter(p -> p % 2 == 0).count());
        System.out.println(list5.stream().filter(p -> p % 2 == 0).distinct().count()); // how many unique even numbers

        List<String> list6 = new ArrayList<>(Arrays.asList("java", "soft skills", "javascript", "JAVA", "JAVAscript", "selenium", "restassured", "cypress"));

        System.out.println(list6.stream().filter(p -> {
            p = p.toLowerCase();
            return p.contains("java");
        }).collect(Collectors.toList()));

        System.out.println(list6.stream().filter(p ->
            p.toLowerCase().contains("java")).count());

        list6.stream().map(s -> s.toUpperCase()).forEach(e -> System.out.print(e + " "));
        System.out.println();
        list6.stream().map(s -> s.toUpperCase()).forEach(System.out::print);

    }
}


/*
    .method1().method2.method3()
    write it as:
    .method1()
    .method2()
    .method3()

 */