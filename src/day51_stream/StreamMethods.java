package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // Create stream
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 4, 6, 12, 5));
        list1.stream(); // creates the stream, Need to do more
        System.out.println(list1.stream());

        int[] arr1 = {3, 5, 6, 12, 5};
        Arrays.stream(arr1); // made stream from array

        // distinct : removes duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 1, 2, 3, 4, 5, 6, 6, 7, 6, 5, 4, 2, 4, 1, 5, 7, 4, 2));

        System.out.println("distinct: " + list2.stream().distinct().collect(Collectors.toList())); // just print
//        list2 = list2.stream().distinct().collect(Collectors.toList()); just reassign back into the same reference
//        List<Integer> newRef = list2.stream().distinct().collect(Collectors.toList()); // can create new reference to store the new data
        System.out.println("list2: " + list2);
        /*
            .stream() -> converts the list to a stream
            .distinct() -> removes all the duplicates from the Stream
            .collect(Collectors.toList()) -> converts the Stream to a List type
         */

        int[] arr2 = {1, 1, 1, 2, 1, 2, 3, 4, 5, 6, 6, 7, 6, 5, 4, 2, 4, 1, 5, 7, 4, 2};
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println("distinct w/ array: " + Arrays.toString(arr2));





    }
}
