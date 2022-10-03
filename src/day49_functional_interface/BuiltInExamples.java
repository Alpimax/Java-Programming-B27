package day49_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInExamples {

    public static Predicate<Integer> lessThan5 = p -> p < 5;  // BuiltInExamples.lessThan5.test()

    public static void main(String[] args) {

        Predicate<Integer> isPrime = p -> {

            if(p < 2) return false;

            for(int i = 2; i <= p/2; i++){
                if(p % i == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.println(isPrime.test(8));
        System.out.println(isPrime.test(-4));
        System.out.println(isPrime.test(11));

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 21, 6, 12, 4, 15, 1, 2, 5, 1, 2, 4, 1, 5, 12, 3, 5, 12, 32, 5, 15, 2));

        nums.removeIf(isPrime);
        System.out.println(nums);

        nums = new ArrayList<>(Arrays.asList(1, 5, 21, 6, 12, 4, 15, 1, 2, 5, 1, 2, 4, 1, 5, 12, 3, 5, 12, 32, 5, 15, 2));
        nums.removeIf( p -> p < 10);
        System.out.println(nums);

        System.out.println("---------------------------");

        Consumer<int[]> printArray = arr -> {
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " - ");
            }
        };

        printArray.accept(new int[]{3, 5, 1, 2, 5});

        System.out.println("---------------------------");

        List<String> words = new ArrayList<>(Arrays.asList("java", "soft skills", "house", "shed", "garden", "emoji", "fun"));
        words.forEach(each -> System.out.println(each));
        System.out.println("---------------------------");

        words.forEach(each -> {
            System.out.println("" + each.charAt(0) + each.charAt(each.length() -1));
            System.out.println(each.length());
        });

        System.out.println("---------------------------");

        words.forEach(each -> System.out.println(each.substring(0,3)));

        System.out.println("---------------------------");

        Function<int[],List<Integer>> convertToList = (arrNums) -> {
            List<Integer> list = new ArrayList<>();
            for(int each : arrNums){
                list.add(each);
            }
            return list;
        };

        int[] arr1 = {3, 4, 1, 5, 12, 5};
        List<Integer> list1 = convertToList.apply(arr1);
        System.out.println(list1);

        System.out.println("---------------------------");

        Function<int[], int[]> swapElements = array -> {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
            return array;
        };

        System.out.println(Arrays.toString(swapElements.apply(new int[]{4, 1, 5, 12, 5, 2, 69, 120, 249})));


    }
}
