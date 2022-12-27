package day48_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        /*
            apple
            a - 1
            p - 2
            l - 1
            e - 1
         */

        String str = "hello world";
        Map<Character, Integer> counter = new LinkedHashMap<>();

        /*
            String s = applep
            map:
                a - 1
                p - 3
                l - 1
                e - 1

         */

        for(int i = 0; i < str.length(); i++){
            char key = str.charAt(i);
            if(counter.containsKey(key)){
                counter.put(key, counter.get(key) + 1); // get method will read the current counter value, then it adds 1 to the value, so the new value after adding one get stored as the new value for the same key - which is basically reassigning the value for that key
            } else {
                // this is the first time seeing this character, it is not in the map yet
                counter.put(key, 1);
            }
        }

        System.out.println(counter);

    }
}class Solution {
    public int lengthOfLastWord(String s) {
        String [] arr = s.split(" ");
        int i =  arr[arr.length -1].length();
        return i;
    }
}
