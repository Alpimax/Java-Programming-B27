package day51_stream;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Recap {
    public static void main(String[] args) {


//        1.1 Create a function that can check if two array are equal and contains the same elements'
//        ex:   arr1 = {3,2,1}
//              arr2 = {2,1,3}

        BiPredicate<int[], int[]> arrayEquals =  (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        System.out.println(arrayEquals.test(new int[]{3, 2, 1}, new int[]{1, 2, 3}));

        // idea: 1 array is iterated
        // 1 array is a String -> as you go through each element of the first array, replace the First occurrence of it in the String
        // at the end it the String is empty(no numbers) then they were the same


        /*
                1.1 Create a function that can returns the common characters of two strings
                ex: str1 = "Python"
                    str2 = "Wooden Spoon"

                output: on
         */

        BiFunction<String, String, String> commonChars = (str1, str2) -> {

            String common = "";

            for(int i = 0; i < str1.length(); i++){
                if(!common.contains(str1.substring(i, i + 1)) && str2.contains(str1.substring(i, i+1))){ //str2.contains("" + str1.charAt(i));
                    common += str1.charAt(i);
                }
            }

            return common;
        };

        System.out.println(commonChars.apply("WoodenP Spoon", "Python"));

    }
}
