package day47_collections;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        Map<Character, Integer> gradeScale = new HashMap<>();
        // adding to a map: put()
        gradeScale.put('A', 90);
        gradeScale.put('B', 80);
        gradeScale.put('C', 70);
        gradeScale.put('D', 60);
        gradeScale.put('Z', 1000);
        gradeScale.put('Z', 3000); // using put with a key that is already in the map, will update the value

        System.out.println(gradeScale);

        // readying from a map: get()
        System.out.println(gradeScale.get('B')); // goes to the key and returns that value
        System.out.println(gradeScale.get('b'));

        // removing from a map : remove()
        gradeScale.remove('Z');
        System.out.println(gradeScale);

        // contains in a map

        System.out.println(gradeScale.containsKey('C'));
        System.out.println(gradeScale.containsKey('c'));

        System.out.println(gradeScale.containsValue(100));
        System.out.println(gradeScale.containsValue(90));


    }
}
