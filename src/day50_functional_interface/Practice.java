package day50_functional_interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Practice {
    public static void main(String[] args) {

        /*
        Use Predicate Functional interface to:
            1.1 Create a function that can verify if a number contains duplicate digits
                true -> duplicate

            1123 --> 1, 2, 3
            1234 --> 1, 2, 3, 4
         */

        Predicate<Integer> duplicateDigits = p -> {
            String strNum = String.valueOf(p); // "" + p  --> convert the Integer into a String
            Set<String> set = new HashSet<>(Arrays.asList(strNum.split(""))); // splits the digits to their elements as converts all of them into a collection type to then make a HashSet -> Set type does not allow duplicates
            return strNum.length() != set.size();
        };

        System.out.println(duplicateDigits.test(1234));
        System.out.println(duplicateDigits.test(12343));

        //Consumer: 1.2 Create a function that prints the middle character/s of a String

        Consumer<String> middleChars = str -> {
            int len = str.length();
            if(len % 2 == 0){  // banana
                System.out.println(str.substring(len/2 - 1, len/2 + 1));
            } else {
                System.out.println(str.charAt(len/2));
            }
        };

        middleChars.accept("panda");
        middleChars.accept("banana");

        //Function: 1.1 Create a function that can return the sum of digits from a string that contains number digits

        //String - parameter type & Integer - return type
        Function<String,Integer> sumOfDigits = s -> {
            int sum = 0;

            for(int i = 0 ; i < s.length(); i++){
                sum += Integer.parseInt(s.substring(i, i + 1)); // convert each digit(String) to an Integer we add to the sum
            } // charAt() + ""

            return sum;
        };

        System.out.println(sumOfDigits.apply("425"));
        System.out.println(sumOfDigits.apply("9184"));

    }
}
